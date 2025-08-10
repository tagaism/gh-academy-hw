package java.Heap;

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
}
