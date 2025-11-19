package LeetCode;

import Stack.Stack;

/**
 * BinaryTreePreorderTraversal
 *
 * Utility class that demonstrates a recursive preorder traversal of a binary tree.
 * Preorder traversal visits nodes in the order: root, left subtree, right subtree.
 *
 * This class provides a public entry point (Main), a solution method that produces
 * the preorder sequence as a list of integers, and a private recursive helper that
 * performs the depth-first traversal.
 *
 * Time complexity: O(n) — each node is visited exactly once.
 * Space complexity: O(h) additional stack space for recursion (h = tree height). The
 * returned list requires O(n) space to store node values.
 */
 
/**
 * Main entry point for running example code or ad-hoc tests.
 *
 * Currently provided as a placeholder and performs no operations. In typical use,
 * this method can be used to construct sample trees and invoke solution(...) to
 * print or verify traversal results.
 *
 * @param args command-line arguments (unused)
 */
 
/**
 * TreeNode
 *
 * Simple binary tree node class used by BinaryTreePreorderTraversal. Each node
 * stores an integer value and references to left and right child nodes.
 *
 * Fields:
 * - int val: the integer value stored in the node
 * - TreeNode left: reference to the left child (may be null)
 * - TreeNode right: reference to the right child (may be null)
 */

/**
 * TreeNode()
 *
 * Constructs an empty TreeNode with default values. Fields are initialized to
 * their default values (val = 0, left = null, right = null).
 */
 
/**
 * TreeNode(int val)
 *
 * Constructs a TreeNode with the specified value and no children.
 *
 * @param val the integer value to store in the node
 */
 
public class BinaryTreePreorderTraversal {
    public static void Main(String[] args) {

    }

    /**
     * solution
     *
     * Performs a preorder traversal of the given binary tree and returns the node values
     * in visit order.
     *
     * The traversal is implemented recursively via the private helper method. If the
     * provided root is null, an empty list is returned.
     *
     * @param root the root node of the binary tree to traverse; may be null
     * @return an ArrayList of integers containing the node values in preorder (root, left, right)
     *
     * @implNote The method initializes the result list and delegates traversal to
     *           the recursive helper. The returned list preserves insertion order of visits.
     */
    private ArrayList<Integer> solution(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        recursive(root, res);
        return res;
    }

    /**
     * recursive
     *
     * Helper method that performs the actual recursive preorder traversal and appends
     * visited node values to the provided list.
     *
     * The visitation order is:
     * 1. Visit the current node and add its value to the list.
     * 2. Recurse on the left child.
     * 3. Recurse on the right child.
     *
     * The method is null-safe and returns immediately when a null node is encountered.
     *
     * @param node the current TreeNode being visited; may be null
     * @param list the list to which visited node values are appended; must be non-null
     */
    private void recursive(TreeNode node, ArrayList list) {
        if(node == null) return;
        list.add(node.val);
        recursive(node.left, list);
        recursive(node.right, list);
    }

    /**
     * TreeNode(int val, TreeNode left, TreeNode right)
     *
     * Constructs a TreeNode with the specified value and child references.
     *
     * @param val   the integer value to store in the node
     * @param left  reference to the left child node (may be null)
     * @param right reference to the right child node (may be null)
     */
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


