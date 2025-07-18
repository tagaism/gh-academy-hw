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
}
