package com.company.graph;

final class DepthFirstPaths {
    private final int s;
    private boolean[] marked;
    private int[] edgeTo;

    public DepthFirstPaths(Graph graph, int s) {
        this.s = s;
        edgeTo = new int[graph.V()];
        marked = new boolean[graph.V()];
        dfs(graph,s);
    }

    private void dfs(Graph graph, int v) {
        marked[v] = true;
        for(Integer w : graph.adj(v)){
            if(!marked[w]){
                edgeTo[w] = v;
                dfs(graph, w);
            }
        }
    }

    public boolean hasPathTo(int v){
        return marked[v];
    }


}
