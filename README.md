# Adjacency Matrix Graph Project

This project represents a graph using an adjacency matrix. It includes three classes: `Node`, `Graph`, and `Main`.

## Node.java

The `Node` class represents a node in the graph. Each node has a character data to identify it.

## Graph.java

The `Graph` class represents the graph using an adjacency matrix. It supports adding nodes, adding edges, and checking if an edge exists between two nodes.

### Methods:

- `addNode(Node node)`: Adds a node to the graph.
- `addEdge(int src, int dest)`: Adds an edge between two nodes specified by their indices in the nodes list.
- `checkEdge(int src, int dest)`: Checks if there is an edge between two nodes specified by their indices in the nodes list.
- `print()`: Prints the adjacency matrix of the graph, showing the nodes and their connections.

## Main.java

The `Main` class serves as the entry point of the program. It creates a sample graph, adds nodes, and creates edges between nodes. Then, it prints the adjacency matrix of the graph and checks if there is an edge between two nodes.

## How to Use

### Example Code:

```java
package org.alishahidi;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
        System.out.println(graph.checkEdge(0, 1));
    }
}
```
### Output:

|   | A | B | C | D | E |
|---|---|---|---|---|---|
| A | 0 | 1 | 0 | 0 | 1 |
| B | 0 | 0 | 1 | 0 | 0 |
| C | 0 | 0 | 0 | 1 | 1 |
| D | 0 | 0 | 0 | 0 | 0 |
| E | 1 | 0 | 1 | 0 | 0 |

*true*

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Credits

The project is maintained by [Ali Shahidi](https://github.com/alishahidi).

Feel free to use this project as a reference for understanding how to implement an adjacency matrix graph in Java. If you have any suggestions or improvements, please feel free to contribute!
