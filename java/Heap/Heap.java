package Heap;

import java.util.ArrayList;
/**
 * The {@code Heap} class implements a max-heap data structure using an {@link ArrayList}.
 * It provides methods for inserting and removing elements while maintaining the heap property.
 * <p>
 * The heap is represented as a binary tree, where each parent node is greater than or equal to its child nodes.
 * This class offers functionality to:
 * <ul>
 *   <li>Insert elements into the heap with automatic reordering to preserve the max-heap property.</li>
 *   <li>Remove the maximum element (root) from the heap, with reordering to maintain the heap structure.</li>
 *   <li>Retrieve a snapshot of the current heap contents.</li>
 * </ul>
 * <p>
 * Note: The internal {@code ArrayList} is encapsulated and not exposed directly.
 *
 * Example usage:
 * <pre>
 *     Heap heap = new Heap();
 *     heap.insert(10);
 *     heap.insert(20);
 *     Integer max = heap.remove(); // returns 20
 * </pre>
 *
 * @author tagaism
 * @version 1.0
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
     * Removes the root (maximum) element from the heap.
     * If the heap is empty, returns null. After removing the root, the heap is reordered to maintain the heap property.
     * @return The maximum integer value that was the root of the heap, or null if the heap is empty.
     */
    public Integer remove() {
        if(heap.size() == 0) return null;
        if(heap.size() == 1) {
            return heap.remove(0);
        }
        int removedElement = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);
        return removedElement;
    }

    /**
     * Performs the "sink down" operation to maintain the heap property.
     * Starting from the given index, it compares the node with its children
     * and swaps it with the larger child if necessary, repeating the process
     * until the heap property is satisfied.
     *
     * @param ind The index of the node to sink down.
     */
    public void sinkDown(int ind) {
        int maxInd = ind;
        while (true) {
            int leftInd = leftChild(ind);
            int rightInd = rightChild(ind);

            if(leftInd > heap.size() && heap.get(leftInd) > heap.get(maxInd)) {
                maxInd = leftInd;
            }

            if(rightInd > heap.size() && heap.get(rightInd) > heap.get(maxInd)) {
                maxInd = rightInd;
            }

            if(maxInd != ind) {
                swap(maxInd, ind);
                ind = maxInd;
            } else {
                return;
            }
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

    /**
     * Calculates the index of the left child of a node in the heap.
     *
     * @param ind The index of the parent node.
     * @return The index of the left child of the node.
     */
    private int leftChild(int ind) {
        return ind * 2 + 1;
    }

    /**
     * Calculates the index of the right child of a node in a binary heap.
     *
     * @param ind The index of the parent node.
     * @return The index of the right child of the node.
    */
    private int rightChild(int ind) {
        return ind * 2 + 2;
    }
}
