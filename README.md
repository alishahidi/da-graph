# Graph Project

## Introduction
This project provides a graph data structure implementation along with two graph search algorithms - Depth-First Search (DFS) and Breadth-First Search (BFS).

## Graph Representation
The graph representation in this project includes the following components:
- `org.alishahidi.graph.matrix.MatrixGraph`: A matrix-based graph representation.

## Depth-First Search (DFS) Algorithm
The DFS algorithm is a popular graph traversal algorithm that explores as far as possible along each branch before backtracking. The project includes the following components for DFS:
- `org.alishahidi.search.DepthFirstSearch`: An implementation of the Depth-First Search algorithm.

## Breadth-First Search (BFS) Algorithm
The BFS algorithm is another graph traversal algorithm that explores all the vertices of a graph in breadth-first order. The project includes the following components for BFS:
- `org.alishahidi.search.BreadthFirstSearch`: An implementation of the Breadth-First Search algorithm.

## Usage
To use the graph and graph search algorithms, follow these steps:

1. Create an instance of `org.alishahidi.graph.matrix.MatrixGraph`.
2. Add nodes to the graph using the `addNode` method.
3. Add edges between nodes using the `addEdge` method.
4. Use the `org.alishahidi.search.DepthFirstSearch` or `org.alishahidi.search.BreadthFirstSearch` class to perform graph search.

```java
import org.alishahidi.graph.Node;
import org.alishahidi.graph.matrix.MatrixGraph;
import org.alishahidi.search.DepthFirstSearch;
import org.alishahidi.search.BreadthFirstSearch;

public class Main {
    public static void main(String[] args) {
        MatrixGraph graph = new MatrixGraph(5);

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

        // Perform Depth-First Search
        DepthFirstSearch dfs = new DepthFirstSearch(graph);
        dfs.search(0);

        // Perform Breadth-First Search
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph);
        bfs.search(0);
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

## Depth-First Search
```text
A = visited
B = visited
C = visited
D = visited
E = visited
```

## Breadth-First Search

```text
A = visited
B = visited
C = visited
D = visited
E = visited
```

## Graph Implementation Comparison

This table compares the ListGraph and MatrixGraph implementations, along with their respective time complexities (in Big O notation) for various operations.

| Graph Implementation | Adding Nodes (Time Complexity) | Adding Edges (Time Complexity) | Checking Edge (Time Complexity) | Space Complexity |
|---------------------|-------------------------------|-------------------------------|--------------------------------|------------------|
| ListGraph           | O(1)                          | O(1)                          | O(V)                           | O(V + E)         |
| MatrixGraph         | O(1)                          | O(1)                          | O(1)                           | O(V^2)           |

## Graph Search Algorithms Comparison

This table compares two graph search algorithms - Depth-First Search (DFS) and Breadth-First Search (BFS) - based on their time and space complexities.

| Algorithm         | Description                                   | Time Complexity (Average Case) | Time Complexity (Worst Case) | Space Complexity | 
|-------------------|-----------------------------------------------|--------------------------------|-----------------------------|------------------|
| Depth-First Search (DFS) | Explores as far as possible along each branch before backtracking. | O(V + E)                        | O(V + E)                      | O(V)               |
| Breadth-First Search (BFS) | Explores all vertices in breadth-first order. | O(V + E)                        | O(V + E)                      | O(V)               |

- V: Number of vertices in the graph.
- E: Number of edges in the graph.

The table provides a quick overview of the time and space complexities of both DFS and BFS algorithms. These complexities are useful for understanding the efficiency of the algorithms in different scenarios. Please note that the complexities mentioned here are for the algorithms alone and do not include the complexity of constructing the graph or any other additional operations outside the search algorithms.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Credits

The project is maintained by [Ali Shahidi](https://github.com/alishahidi).

Feel free to use this project as a reference for understanding how to implement an adjacency matrix graph in Java. If you have any suggestions or improvements, please feel free to contribute!
