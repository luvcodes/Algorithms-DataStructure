package 图.图的存储结构.邻接表;

import java.util.LinkedList;

public class DirectedGraph {
    private int vertices; // 顶点数
    private LinkedList<Integer>[] adjacencyList; // 邻接表

    public DirectedGraph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // 添加边
    public void addEdge(int source, int destination) {
        if (source >= vertices || destination >= vertices || source < 0 || destination < 0) {
            System.out.println("Invalid vertices");
            return;
        }
        adjacencyList[source].add(destination); // 有向图，所以只在源顶点的列表中添加目标顶点
    }

    // 打印邻接表
    public void printAdjacencyList() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adjacencyList[i].size(); j++) {
                System.out.print(adjacencyList[i].get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);

        System.out.println("Adjacency List:");
        graph.printAdjacencyList();
    }
}
