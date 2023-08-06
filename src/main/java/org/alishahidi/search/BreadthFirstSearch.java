package org.alishahidi.search;

import org.alishahidi.graph.matrix.MatrixGraph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    private final MatrixGraph graph;

    public BreadthFirstSearch(MatrixGraph graph) {
        this.graph = graph;
    }

    public void search(int src){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.getMatrix().length];

        queue.offer(src);
        visited[src] = true;

        while (!queue.isEmpty()){
            src = queue.poll();
            System.out.println(graph.getNodes().get(src).getNode() + " = visited");
            for(int i = 0; i < graph.getMatrix()[src].length; i++){
                if(graph.getMatrix()[src][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
