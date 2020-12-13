package com.java.streamapi.DFS;

import java.util.Stack;

public class DFS {
    Stack<Vertex> stack;
    public DFS(){
        this.stack= new Stack<>();
    }

    public void dfs(Vertex root){
        stack.add(root);
        root.setVisited(true);

        while(!stack.isEmpty()){
            Vertex actualVertex = stack.pop();
            System.out.print(actualVertex+" ");
            for(Vertex v : actualVertex.getAdjecentList()){
                if(!v.isVisited(true)){
                      v.setVisited(true);
                      v.setPredecessor(actualVertex);
                      stack.push(v);
                }

            }
        }


    }
}
