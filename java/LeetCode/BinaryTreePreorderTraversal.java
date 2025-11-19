package LeetCode;

import Stack.Stack;

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


