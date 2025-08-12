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

    public ArrayList<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    public boolean insert(int val) {
        heap.add(val);
        int curr = heap.size() - 1;
        while(curr > 0 && heap.get(curr) > heap.get(parent(curr))) {
            swap(curr, parent(curr));
            curr = parent(curr);
        }
    }

    private int parent(int ind) {
        return (ind - 1) / 2;
    }

    private void swap(int ind1, int ind2) {
        int temp = heap.get(ind1);
        heap.set(ind1, heap.get(ind2));
        heap.set(ind2, temp);
    }
}
