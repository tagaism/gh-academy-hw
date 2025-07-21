package DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;    
    class Node{
        int value;
        Node next;
        Node prev;

        Node(int val) {
            value = val;
        }
    }

    DoublyLinkedList(int val) {
        Node nn = new Node(val);
        head = nn;
        tail = nn;
        length = 1;
    }

    /**
     * Appends a new node with the specified value to the end of the doubly linked list.
     * <p>
     * If the list is empty, the new node becomes both the head and the tail.
     * Otherwise, the new node is added after the current tail, and the tail reference is updated.
     * Increments the length of the list by one.
     *
     * @param val the value to be stored in the new node
     */
    public void append(int val) {
        Node nn = new Node(val);
        if(head == null) {
            // this means tail is also null;
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
        length++;
    }

    /**
     * Inserts a new node with the specified value at the beginning of the doubly linked list.
     * If the list is empty, the new node becomes both the head and the tail.
     * Otherwise, the new node is linked before the current head.
     *
     * @param val the value to be added to the front of the list
     */
    public void prepend(int val) {
        Node nn = new Node(val);
        if(head == null) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
        length++;
    } 

    /**
     * Removes and returns the last node from the doubly linked list.
     *
     * @return the removed {@code Node} if the list is not empty; {@code null} otherwise
     */
    public Node removeLast() {
        if(length == 0) return null;
        Node temp = tail;
        //      t
        //1 2 3 4 5
        //        tmp
        tail = temp.prev;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    /**
     * Removes and returns the first node from the doubly linked list.
     *
     * @return the removed Node if the list is not empty; otherwise, returns null.
     *         If the list has only one node, both head and tail are set to null.
     *         Otherwise, updates the head and properly disconnects the removed node.
     */
    public Node removeFirst() {
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    /**
     * Retrieves the node at the specified index in the doubly linked list.
     *
     * @param idx the zero-based index of the node to retrieve
     * @return the {@code Node} at the specified index, or {@code null} if the index is out of bounds or the list is empty
     */
    public Node get(int idx) {
        if(idx >= length || idx < 0 || length == 0) return null;
        Node curr = head;
        while(idx-- != 0) {
            curr = curr.next;
        }
        return curr;
    }

    /**
     * Updates the value of the node at the specified index in the doubly linked list.
     *
     * @param idx the index of the node to update
     * @param val the new value to set for the node
     * @return true if the node was found and updated; false if the index is out of bounds
     */
    public boolean set(int idx, int val) {
        Node temp = get(idx);
        if(temp == null) return false;
        temp.value = val;
        return true;
    }

    /**
     * Inserts a new node with the specified value at the given index in the doubly linked list.
     *
     * @param idx the position at which to insert the new node (0-based index)
     * @param val the value to be stored in the new node
     * @return true if the insertion was successful; false if the index is out of bounds
     *
     * <p>
     * If {@code idx} is 0, the value is prepended to the list.
     * If {@code idx} is equal to the current length, the value is appended to the list.
     * Otherwise, the value is inserted at the specified position.
     * </p>
     */
    public boolean insert(int idx, int val) {
        if(idx < 0 || idx > length) return false;
        if(idx == 0) {
            prepend(val);
            return true;
        }
        if(idx == length) {
            append(val);
            return true;
        }
        Node nn = new Node(val);
        Node before = get(idx - 1);
        Node after = get(idx + 1);
        nn.next = after;
        after.prev = nn;
        nn.prev = before;
        before.next = nn;
        length++;
        return true;
    }

    /**
     * Removes and returns the node at the specified index in the doubly linked list.
     * <p>
     * If the index is 0, removes the first node.
     * If the index is the last position, removes the last node.
     * Otherwise, removes the node at the given index and updates the links of adjacent nodes.
     * </p>
     *
     * @param idx the index of the node to remove
     * @return the removed {@code Node}, or {@code null} if the index is invalid
     */
    public Node remove(int idx) {
        if(idx == 0) {
            return removeFirst();
        }
        if(idx == length - 1) {
            return removeLast();
        }
        Node temp = get(idx);
        if(temp == null) return null;
        Node before = temp.prev;
        Node after = temp.next;
        before.next = after;
        after.prev = before;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    /**
     * Checks whether the doubly linked list is a palindrome.
     * A palindrome is a sequence that reads the same backward as forward.
     * This method compares the values from the head and tail of the list,
     * moving towards the center, and returns {@code true} if all corresponding
     * values are equal, otherwise returns {@code false}.
     *
     * @return {@code true} if the list is a palindrome, {@code false} otherwise
     */
    public boolean isPalindrome() {
        Node left = head;
        Node right = tail;
        while(left != right && right.next != left) {
            if(left.value != right.value) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }

    /**
     * Rearranges the nodes in the doubly linked list such that all nodes with values
     * less than or equal to the specified value {@code x} come before nodes with values
     * greater than {@code x}. The relative order of nodes within each partition is preserved.
     *
     * @param x the partition value; nodes with values greater than {@code x} are moved after nodes with values less than or equal to {@code x}
     */
    public void partitionBy(int x) {
        Node d1 = new Node(0);
        Node d2 = new Node(0);
        Node c1 = d1;
        Node c2 = d2;
        Node c = head;
        while(c != null) {
            if(c.value > x) {
                c2.next = c;
                c.prev = c2;
                c2 = c;
            } else {
                c1.next = c;
                c.prev = c1;
                c1 = c;
            }
            c = c.next;
        }
        c1.next = d2.next;
        if(d2.next != null) {
            d2.next.prev = c1;
        }
        head = d1.next;
        if(head != null) {
            head.prev = null;
        }
    }
}
