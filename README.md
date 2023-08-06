# Graph Project with ListGraph and MatrixGraph

This project represents a graph using two different implementations: ListGraph and MatrixGraph. Each implementation provides methods for adding nodes, adding edges, and checking if an edge exists between two nodes.

## ListGraph (org.alishahidi.graph.list.ListGraph)

The ListGraph implementation uses an adjacency list to represent the graph. It utilizes an ArrayList of LinkedLists to store the nodes and their connections.

### Methods:

- `addNode(Node node)`: Adds a node to the graph.
- `addEdge(int src, int dest)`: Adds an edge between two nodes specified by their indices in the nodes list.
- `checkEdge(int src, int dest)`: Checks if there is an edge between two nodes specified by their indices in the nodes list.
- `print()`: Prints the adjacency list representation of the graph, showing the nodes and their connections.

## MatrixGraph (org.alishahidi.graph.matrix.MatrixGraph)

The MatrixGraph implementation uses an adjacency matrix to represent the graph. It uses a 2D array to store the edges between nodes.

### Methods:

- `addNode(Node node)`: Adds a node to the graph.
- `addEdge(int src, int dest)`: Adds an edge between two nodes specified by their indices in the nodes list.
- `checkEdge(int src, int dest)`: Checks if there is an edge between two nodes specified by their indices in the nodes list.
- `print()`: Prints the adjacency matrix representation of the graph, showing the nodes and their connections.

## Graph Implementation Comparison

This table compares the ListGraph and MatrixGraph implementations, along with their respective time complexities (in Big O notation) for various operations.

| Graph Implementation | Adding Nodes (Time Complexity) | Adding Edges (Time Complexity) | Checking Edge (Time Complexity) | Space Complexity |
|---------------------|-------------------------------|-------------------------------|--------------------------------|------------------|
| ListGraph           | O(1)                          | O(1)                          | O(V)                           | O(V + E)         |
| MatrixGraph         | O(1)                          | O(1)                          | O(1)                           | O(V^2)           |
### Example Code:

```java
package org.alishahidi;

import org.alishahidi.graph.Node;
import org.alishahidi.graph.list.ListGraph;
import org.alishahidi.graph.matrix.MatrixGraph;

public class Main {
    public static void main(String[] args) {
        // Example using ListGraph
        ListGraph listGraph = new ListGraph();
        listGraph.addNode(new Node('A'));
        listGraph.addNode(new Node('B'));
        listGraph.addNode(new Node('C'));
        listGraph.addEdge(0, 1);
        listGraph.addEdge(1, 2);
        listGraph.print();

        // Example using MatrixGraph
        MatrixGraph matrixGraph = new MatrixGraph(3);
        matrixGraph.addNode(new Node('A'));
        matrixGraph.addNode(new Node('B'));
        matrixGraph.addNode(new Node('C'));
        matrixGraph.addEdge(0, 1);
        matrixGraph.addEdge(1, 2);
        matrixGraph.print();
    }
}
```
# Outputs

## ListGraph:

```text
A ->
B -> A ->
C -> B ->
```

## MatrixGraph:

```text
% A B C
A 0 1 0
B 0 0 1
C 0 0 0
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Credits

The project is maintained by [Ali Shahidi](https://github.com/alishahidi).

Feel free to use this project as a reference for understanding how to implement an adjacency matrix graph in Java. If you have any suggestions or improvements, please feel free to contribute!
