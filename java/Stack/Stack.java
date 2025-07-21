package Stack;

import java.util.ArrayList;

/**
 * A generic stack implementation using an ArrayList as the underlying data structure.
 * Provides standard stack operations such as push, checking if the stack is empty,
 * and retrieving the current height of the stack.
 *
 * @param <T> the type of elements held in this stack
 */
public class Stack<T> {
    private ArrayList<T> stackList = new ArrayList<>();

    /**
     * Returns the number of elements currently in the stack.
     *
     * @return the height of the stack as an integer
     */
    public int getHeight() {
        return stackList.size();
    }

    /**
     * Checks if the stack is empty.
     *
     * @return {@code true} if the stack contains no elements, {@code false} otherwise.
     */
    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    /**
     * Adds the specified element to the top of the stack.
     *
     * @param val the element to be pushed onto the stack
     */
    public void push(T val) {
        stackList.add(val);
    }
}
