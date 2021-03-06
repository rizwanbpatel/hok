package com.company.graph;

import java.util.HashSet;
import java.util.Set;

public class WeightedDigraph {
    private int V;
    private Set<Edge>[] adj;

    public WeightedDigraph(int V) {
        this.V = V;
        adj = (Set<Edge>[]) new Set[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new HashSet<>();
        }
    }

    public void addEdge(Edge e){
        int v = e.from();
        adj[v].add(e);
    }

    public Iterable<Edge> adj(int v){
        return adj[v];
    }

}
