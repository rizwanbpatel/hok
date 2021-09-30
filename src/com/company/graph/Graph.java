package com.company.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final int V;
    private int E;
    private List<List<Integer>> adj;

    public Graph(int v) {
        this.V = v;
        this.E = 0;
        adj = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adj.add(i, new ArrayList<>());
        }
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public void addEdge(int v, int w){
      //  System.out.println(v + "->"+w);
        E++;
        adj.get(v).add(w);
        adj.get(w).add(v);
    }

    public List<Integer> adj(int v){
        return adj.get(v);
    }
}
