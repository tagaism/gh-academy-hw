#!/bin/bash

# --- Configuration ---
# Set the directory you want to watch (relative to the script's location or absolute)
WATCH_DIR="MyFiles"
# Set the Git remote name (usually 'origin')
REMOTE_NAME="origin"
# Set the branch name you want to push to (e.g., 'main', 'master')
BRANCH_NAME="main"
# Commit message prefix
COMMIT_MSG_PREFIX="Auto-commit: Add new file"
# --- End Configuration ---

# --- Helper Function for Logging ---
log() {
  echo "$(date '+%Y-%m-%d %H:%M:%S') - $1"
}

# --- Prerequisite Checks ---
log "Starting up..."

# 1. Check if inotifywait is installed
if ! command -v inotifywait &> /dev/null; then
  log "Error: 'inotifywait' command not found. Please install 'inotify-tools'."
  log "Exiting."
  exit 1
fi

# 2. Check if git is installed
if ! command -v git &> /dev/null; then
  log "Error: 'git' command not found. Please install Git."
  log "Exiting."
  exit 1
fi

# 3. Resolve the absolute path for WATCH_DIR
WATCH_DIR_ABS=$(realpath "$WATCH_DIR")
if [[ $? -ne 0 || ! -d "$WATCH_DIR_ABS" ]]; then
    log "Error: Watch directory '$WATCH_DIR' not found or is not a directory (resolved to '$WATCH_DIR_ABS')."
    log "Exiting."
    exit 1
fi
log "Resolved watch directory to: $WATCH_DIR_ABS"

# 4. Check if the watch directory is inside a Git repository
REPO_ROOT=$(git -C "$WATCH_DIR_ABS" rev-parse --show-toplevel 2>/dev/null)
if [[ $? -ne 0 || -z "$REPO_ROOT" ]]; then
    log "Error: '$WATCH_DIR_ABS' is not inside a Git repository."
    log "Exiting."
    exit 1
fi
log "Git repository found at: $REPO_ROOT"

# 5. Ensure we run git commands from the repository root for consistency
cd "$REPO_ROOT" || exit 1
log "Changed directory to repository root: $REPO_ROOT"

# --- Main Monitoring Loop ---
log "Watching for new files in: $WATCH_DIR_ABS"
log "Will push to remote '$REMOTE_NAME', branch '$BRANCH_NAME'."
log "Press Ctrl+C to stop."

inotifywait -m -q -e create -e moved_to --format '%f' "$WATCH_DIR_ABS" | \
while IFS= read -r filename; do
  # Construct the full path relative to the repo root
  # First get path relative to watch dir, then make it relative to repo root
  filepath_abs="$WATCH_DIR_ABS/$filename"
  filepath_rel=$(realpath --relative-to="$REPO_ROOT" "$filepath_abs")

  log "Detected potential new item: $filename (in $WATCH_DIR_ABS)"

  # Ensure it's actually a file (not a directory) and exists
  # Need to check absolute path for existence/type
  if [[ -f "$filepath_abs" ]]; then
    log "Confirmed new file: $filepath_rel"

    # --- Git Operations ---
    log "Staging file: $filepath_rel"
    git add "$filepath_rel"
    if [[ $? -ne 0 ]]; then
        log "Error: Failed to 'git add $filepath_rel'. Skipping commit/push for this file."
        continue # Skip to the next detected event
    fi

    log "Committing file: $filepath_rel"
    git commit -m "$COMMIT_MSG_PREFIX $filepath_rel"
    if [[ $? -ne 0 ]]; then
        log "Error: Failed to 'git commit $filepath_rel'. You might need to resolve conflicts or stage manually."
        log "Attempting to reset staged changes for this file to avoid issues."
        git reset HEAD "$filepath_rel" # Try to unstage if commit failed
        continue # Skip to the next detected event
    fi

    log "Pushing changes to $REMOTE_NAME $BRANCH_NAME"
    git push "$REMOTE_NAME" "$BRANCH_NAME"
    if [[ $? -ne 0 ]]; then
        log "Error: Failed to 'git push'. Check connection, permissions, and remote state."
        log "The commit for '$filepath_rel' was successful locally but not pushed."
        # The script will continue monitoring, but the push needs manual intervention.
    else
        log "Successfully pushed commit for $filepath_rel."
    fi
    # --- End Git Operations ---

  else
    log "Item '$filename' is not a regular file or no longer exists. Ignoring."
  fi
done

log "Monitoring stopped."
exit 0