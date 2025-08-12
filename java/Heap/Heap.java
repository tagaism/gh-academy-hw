package Heap;

import java.util.ArrayList;
/**
 * Implements a Min-Heap data structure using an `ArrayList`.
 * This class provides basic heap operations such as insertion,
 * and allows retrieval of the heap's current state.
 * <p>
 * The heap property is maintained such that the value of each node
 * is less than or equal to the value of its children.
 * </p>
 */
public class Heap {
    private ArrayList<Integer> heap;
    
    public Heap() {
        heap = new ArrayList<>();
    }


    /**
     * Returns a new `ArrayList` containing all elements currently in the heap.
     * This method provides a snapshot of the heap's contents without exposing
     * the internal `ArrayList` directly.
     * @return A new `ArrayList` containing the heap elements.
     */
    public ArrayList<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    /**
     * Inserts a new integer value into the heap.
     * The heap property (min-heap) is maintained after insertion by bubbling up the new element.
     * @param val The integer value to be inserted.
     */
    
    public boolean insert(int val) {
        heap.add(val);
        int curr = heap.size() - 1;
        while(curr > 0 && heap.get(curr) > heap.get(parent(curr))) {
            swap(curr, parent(curr));
            curr = parent(curr);
        }
    }


    /**
     * Calculates the index of the parent of a node given its index.
     * @param ind The index of the child node.
     * @return The index of the parent node.
     */
    private int parent(int ind) {
        return (ind - 1) / 2;
    }


    /**
     * Swaps two elements in the heap based on their indices.
     * @param ind1 The index of the first element to swap.
     * @param ind2 The index of the second element to swap.
     */
    private void swap(int ind1, int ind2) {
        int temp = heap.get(ind1);
        heap.set(ind1, heap.get(ind2));
        heap.set(ind2, temp);
    }
}
