package Stack;

/**
 * Represents a simple stack data structure using a singly linked list.
 * Supports basic stack operations such as push.
 * 
 * <p>
 * Each stack instance maintains a reference to the top node and its height.
 * Nodes store integer values and a reference to the next node.
 * </p>
 * 
 * Example usage:
 * <pre>
 * Stack stack = new Stack(10);
 * stack.push(20);
 * </pre>
 * 
 * Fields:
 * <ul>
 *   <li>top - Reference to the top node of the stack.</li>
 *   <li>height - Number of elements in the stack.</li>
 * </ul>
 * 
 * Inner Classes:
 * <ul>
 *   <li>Node - Represents an element in the stack.</li>
 * </ul>
 * 
 * Constructors:
 * <ul>
 *   <li>{@code Stack(int val)} - Initializes the stack with a single node containing {@code val}.</li>
 * </ul>
 * 
 * Methods:
 * <ul>
 *   <li>{@code void push(int val)} - Adds a new node with {@code val} to the top of the stack.</li>
 * </ul>
 */
public class Stack {
    Node top;
    int height;
    public class Node {
        int value;
        Node next;
        Node(int val) {
            value = val;
        }
    }

    public Stack(int val) {
        top = new Node(val);
        height = 1;
    }

    /**
     * Pushes a new value onto the top of the stack.
     * Creates a new node with the specified value, sets its next reference to the current top,
     * updates the top to the new node, and increments the stack height.
     *
     * @param val the integer value to be pushed onto the stack
     */
    public void push(int val) {
        Node nn = new Node(val);
        nn.next = top;
        top = nn;
        height++;
    }
}
