package org.alishahidi;

import org.alishahidi.graph.list.ListGraph;
import org.alishahidi.graph.matrix.MatrixGraph;
import org.alishahidi.graph.Node;

public class Main {
    public static void main(String[] args) {
        MatrixGraph matrixGraph = new MatrixGraph(5);

        matrixGraph.addNode(new Node('A'));
        matrixGraph.addNode(new Node('B'));
        matrixGraph.addNode(new Node('C'));
        matrixGraph.addNode(new Node('D'));
        matrixGraph.addNode(new Node('E'));

        matrixGraph.addEdge(0, 1);
        matrixGraph.addEdge(1, 2);
        matrixGraph.addEdge(2, 3);
        matrixGraph.addEdge(2, 4);
        matrixGraph.addEdge(4, 0);
        matrixGraph.addEdge(4, 2);

        matrixGraph.print();

        ListGraph listGraph = new ListGraph();

        listGraph.addNode(new Node('A'));
        listGraph.addNode(new Node('B'));
        listGraph.addNode(new Node('C'));
        listGraph.addNode(new Node('D'));
        listGraph.addNode(new Node('E'));

        listGraph.addEdge(0, 1);
        listGraph.addEdge(1, 2);
        listGraph.addEdge(2, 3);
        listGraph.addEdge(2, 4);
        listGraph.addEdge(4, 0);
        listGraph.addEdge(4, 2);

        listGraph.print();
        System.out.println(listGraph.checkEdge(0, 1));

    }
}