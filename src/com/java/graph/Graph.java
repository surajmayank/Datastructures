package com.java.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Graph {
    public Map<Vertex, List<Vertex>> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(Map<Vertex, List<Vertex>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    private Map<Vertex, List<Vertex>> adjVertices;

    public void addVertex(int lable){
        adjVertices.put(new Vertex(lable), new ArrayList<Vertex>());
    }
}
