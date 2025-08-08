package Graph;

import java.util.HashMap;
import java.util.ArrayList;

/**
 * This class represents a Graph data structure.
 * It uses an adjacency list to store the graph.
 */
public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    /**
     * Prints the adjacency list representation of the graph.
     */
    public void printGraph() {
        System.out.println(adjList);
    }

    /**
     * Adds a new vertex to the graph.
     * @param vertex The vertex to be added.
     * @return true if the vertex was added successfully, false otherwise (if the vertex already exists).
     */
    public boolean addVertex(String vertex) {
        if(adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    /**
     * Adds an edge between two vertices in the graph.
     * @param vertex1 The first vertex.
     * @param vertex2 The second vertex.
     * @return true if the edge was added successfully, false otherwise (if one or both vertices do not exist).
     */
    public boolean addEdge(String vertex1, String vertex2) {
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    /**
     * Removes an edge between two vertices in the graph.
     * @param vertex1 The first vertex.
     * @param vertex2 The second vertex.
     * @return true if the edge was removed successfully, false otherwise (if one or both vertices do not exist).
     */
    public boolean removeEdge(String vertex1, String vertex2) {
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;  
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if(adjList.get(vertex) == null) return false;

        for(String vert : adjList.get(vertex)) {
            adjList.get(vert).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }