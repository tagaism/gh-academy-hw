package LeetCode;

import Stack.Stack;

public class BinaryTreePreorderTraversal {
    public static void Main(String[] args) {

    }

    private ArrayList<Integer> solution(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        recursive(root, res);
        return res;
    }

    private void recursive(TreeNode node, ArrayList list) {
        if(node == null) return;
        list.add(node.val);
        recursive(node.left, list);
        recursive(node.right, list);
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


