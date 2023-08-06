package org.alishahidi.graph.matrix;

import org.alishahidi.graph.Node;

import java.util.ArrayList;

public class MatrixGraph {
    ArrayList<Node> nodes;
    private final int [][] matrix;

    public MatrixGraph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int src, int dest){
        matrix[src][dest] = 1;
    }

    public boolean checkEdge(int src, int dest){
        return matrix[src][dest] == 1;
    }

    public void print(){
        System.out.print("% ");
        for(Node node: nodes){
            System.out.print(node.getNode() + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).getNode() + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
