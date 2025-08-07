package Graph;

import java.util.HashMap;
import java.util.ArrayList;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex) {
        if(adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }
}
