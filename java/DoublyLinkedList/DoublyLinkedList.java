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

    public boolean set(int idx, int val) {
        Node temp = get(idx);
        if(temp == null) return false;
        temp.value = val;
        return true;
    }
}
