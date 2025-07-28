package BinarySearchTree;

public class BinarySearchTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;
        Node(int val) {
            value = val;
        }
    }

    public Node getRoot() {
        return root;
    }

    public boolean insert(int val) {
        Node nn = new Node(val);
        if(root == null) {
            root = nn;
        } else {
            Node curr = new Node(val);
            while(curr != null) {
                if(val > curr.value) {
                    curr.right = nn;
                    curr = curr.right;
                } else {
                    curr.left = nn;
                    curr = curr.left;
                }
            }
        }
        return true;
    }
}
