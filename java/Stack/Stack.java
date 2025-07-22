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

    /**
     * Removes and returns the top element from the stack.
     * If the stack is empty, returns {@code null}.
     *
     * @return the element removed from the top of the stack, or {@code null} if the stack is empty
     */
    public T pop() {
        if(isEmpty()) return null;
        return stackList.remove(stackList.size() - 1);
    }

    /**
     * Returns the element at the top of the stack without removing it.
     * If the stack is empty, returns {@code null}.
     *
     * @return the top element of the stack, or {@code null} if the stack is empty
     */
    public T peek() {
        if(isEmpty()) return null;
        return stackList.get(stackList.size() - 1);
    }

    /**
     * Sorts the given stack in ascending order using an auxiliary stack.
     * Only works for stacks of Integer type.
     *
     * @param st the stack to be sorted
     */
    public void sortStack(Stack<Integer> st) {
        Stack<Integer> aux = new Stack<>();
        while (!st.isEmpty()) {
            int temp = st.pop();
            while (!aux.isEmpty() && aux.peek() > temp) {
                st.push(aux.pop());
            }
            aux.push(temp);
        }
        while (!aux.isEmpty()) {
            st.push(aux.pop());
        }
    }
}
