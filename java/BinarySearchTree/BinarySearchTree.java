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

    /**
     * Inserts a new value into the binary search tree.
     * <p>
     * If the tree is empty, the value becomes the root. If the value already exists,
     * the method returns {@code true} without inserting a duplicate.
     * Otherwise, the value is inserted at the appropriate position to maintain
     * the binary search tree property.
     * </p>
     *
     * @param val the integer value to insert into the tree
     * @return {@code true} if the value was inserted or already exists in the tree
     */
    public boolean insert(int val) {
        Node nn = new Node(val);
        if(root == null) {
            root = nn;
            return true;
        }
        Node temp = root;
        while(true) {
            if(val == temp.value) return true;
            if(val < temp.value) {
                if(temp.left == null) {
                    temp.left = nn;
                    return true;
                }
                temp = temp.left;
            } else {
                if(temp.right == null) {
                    temp.right = nn;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    /**
     * Checks whether the binary search tree contains a node with the specified value.
     *
     * @param val the value to search for in the tree
     * @return {@code true} if the value exists in the tree, {@code false} otherwise
     */
    public boolean contains(int val) {
        Node temp = root;
        while(temp != null) {
            if(val < temp.value) {
                temp = temp.left;
            } else if(val > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
