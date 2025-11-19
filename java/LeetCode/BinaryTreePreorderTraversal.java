package LeetCode;

import Stack.Stack;

/**
 * BinaryTreePreorderTraversal
 *
 * <p>Utility class for performing a preorder traversal (root -> left -> right) of a binary tree.
 * The provided traversal method is implemented iteratively using an explicit stack to avoid
 * recursion and returns a list of visited node values in preorder order.</p>
 *
 * <p>Usage summary:
 * - Call solution(TreeNode root) to obtain an ArrayList<Integer> containing the values visited
 *   in preorder. If the input root is null, an empty list is returned.
 * - The Main method is a placeholder entry point intended for testing or running the class;
 *   it does not perform any actions in the current implementation.</p>
 *
 * Methods:
 * - ArrayList<Integer> solution(TreeNode root)
 *   - Parameters:
 *     - root: the root node of the binary tree to traverse; may be null.
 *   - Returns:
 *     - an ArrayList<Integer> containing node values in preorder (root, then left subtree,
 *       then right subtree). If root is null, the returned list is empty.
 *   - Complexity:
 *     - Time: O(n), where n is the number of nodes visited (each node is pushed and popped at most once).
 *     - Space: O(n) worst-case for the stack and the result list (skewed trees).
 *   - Notes:
 *     - The iterative algorithm relies on the push/pop order to enforce the desired traversal.
 *       To visit the left subtree before the right subtree, push the right child first and then
 *       the left child onto the stack so that the left child is popped and processed next.
 *     - The method returns a concrete ArrayList to match the declared return type.
 *
 * Inner types:
 * - class TreeNode
 *   - Represents a node in the binary tree.
 *   - Fields:
 *     - int val: the integer value stored at this node.
 *     - TreeNode left: reference to the left child (may be null).
 *     - TreeNode right: reference to the right child (may be null).
 *   - Constructors:
 *     - TreeNode(): default constructor, creates an empty node (fields may remain uninitialized).
 *     - TreeNode(int val): creates a node with the given value and null children.
 *     - TreeNode(int val, TreeNode left, TreeNode right): creates a node with the given value and
 *       specified left and right children.
 *
 * Additional remarks:
 * - The class is not synchronized and is not safe for concurrent use without external synchronization.
 * - No exceptions are thrown for normal inputs; null roots are handled by returning an empty list.
 * - Example (conceptual): Given a tree with root 1, left child 2 and right child 3, the preorder
 *   traversal result should be [1, 2, 3]. Ensure the stack push order is correct to obtain this result.
 */
public class BinaryTreePreorderTraversal {
    public static void Main(String[] args) {

    }

    private ArrayList<Integer> solution(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode curr = st.pop();
            res.add(curr.val);
            if(curr.left) st.push(curr.left);
            if(curr.right) st.push(curr.right);
        }
        return res;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {};
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left; TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


