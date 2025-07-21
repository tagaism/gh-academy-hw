package Queue;

public class Queue {
    Node first;
    Node last;
    int length;

    class Node {
        int value;
        Node next;
        Node(int val) {
            value = val;
        }
    }

    public Queue(int val) {
        Node nn = new Node(val);
        first = nn;
        last = nn;
        length++;
    }
    
    /**
     * Adds a new element with the specified value to the end of the queue.
     * Creates a new node and updates the queue pointers accordingly.
     * If the queue is empty, both 'first' and 'last' will point to the new node.
     * Increments the length of the queue.
     *
     * @param val the value to be added to the queue
     */
    public void enqueue(int val) {
        Node nn = new Node(val);
        nn.next = last;
        last = nn;
        if(first == null) {
            first = nn;
        }
        length++;
    }
}
