package com.java.streamapi.DFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> adjecentList;
    private Vertex predecessor;

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }

    public boolean isVisited(boolean b) {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjecentList() {
        return adjecentList;
    }

    public void setAdjecentList(List<Vertex> adjecentList) {
        this.adjecentList = adjecentList;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public Vertex(String name){
        this.name=name;
        this.adjecentList=new ArrayList<Vertex>();
    }

    public void addNeighbour(Vertex vertex){
        adjecentList.add(vertex);
    }

}
