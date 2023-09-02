package 图.图的存储结构.邻接多重表;

import java.util.LinkedList;

class Edge {
    int src, dest;

    Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

class Graph {
    int V;
    LinkedList<Edge>[] adjList;

    // Constructor
    Graph(int V) {
        this.V = V;
        adjList = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    void addEdge(int src, int dest) {
        Edge edge = new Edge(src, dest);
        adjList[src].add(edge);
        adjList[dest].add(edge);
    }

    // Print the graph
    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Edge edge : adjList[i]) {
                System.out.print(" -> " + (edge.src == i ? edge.dest : edge.src));
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);

        g.printGraph();
    }
}

