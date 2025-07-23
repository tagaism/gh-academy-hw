package Queue;

import Stack.Stack;

public class Queue {
    Node first;
    Node last;
    int length;

    private Stack<Integer> st1 = new Stack<Integer>();
    private Stack<Integer> st2 = new Stack<Integer>();

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

    /**
     * Removes and returns the node at the front of the queue.
     * If the queue is empty, returns {@code null}.
     * Updates the first and last pointers as necessary.
     *
     * @return the removed {@code Node} from the front of the queue, or {@code null} if the queue is empty
     */
    public Node dequeue() {
        if(length == 0) return null;
        Node temp = first;
        if(length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public void enqueueStack(int val) {
        while(!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        st1.push(val);
        while(!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }
}
