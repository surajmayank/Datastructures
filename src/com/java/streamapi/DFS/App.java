package com.java.streamapi.DFS;

import java.security.PublicKey;

public class App {

    public static void main(String []args){

        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        v1.addNeighbour(v2);
        v1.addNeighbour(v3);
        v2.addNeighbour(v4);
        v2.addNeighbour(v5);
        DFS d = new DFS();
        d.dfs(v1);
    }

}
