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

## How to Use

To use this project, you can follow these steps:

1. Download or clone the project to your local machine.
2. Import the project into your preferred Java IDE (e.g., IntelliJ, Eclipse).
3. Create instances of ListGraph and MatrixGraph.
4. Add nodes and edges using the `addNode` and `addEdge` methods.
5. Print the graph using the `print` method.

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
