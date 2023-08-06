package org.alishahidi.search;

import org.alishahidi.graph.matrix.MatrixGraph;

public class DepthFirstSearch {
    private final MatrixGraph graph;

    public DepthFirstSearch(MatrixGraph graph) {
        this.graph = graph;
    }

    public void search(int src) {
        boolean[] visited = new boolean[graph.getMatrix().length];
        dfsHelper(src, visited);
    }

    private void dfsHelper(int src, boolean[] visited) {
        if (visited[src]) {
            return;
        } else {
            visited[src] = true;
            System.out.println(graph.getNodes().get(src).getNode() + " = visited");
        }

        for (int i = 0; i < graph.getMatrix()[src].length; i++) {
            if (graph.getMatrix()[src][i] == 1) {
                dfsHelper(i, visited);
            }
        }
    }
}
