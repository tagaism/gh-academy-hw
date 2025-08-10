package java.Heap;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> heap;
    
    public Heap() {
        heap = new ArrayList<>();
    }

    public ArrayList<Integer> getHeap() {
        return new ArrayList<>(heap);
    }
}
