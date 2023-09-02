public class DirectedGraph {
    private int vertices; // 顶点数
    private int[][] adjacencyMatrix; // 邻接矩阵

    public DirectedGraph(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
    }

    // 添加边
    public void addEdge(int source, int destination) {
        if (source >= vertices || destination >= vertices || source < 0 || destination < 0) {
            System.out.println("Invalid vertices");
            return;
        }
        adjacencyMatrix[source][destination] = 1;
    }

    // 移除边
    public void removeEdge(int source, int destination) {
        if (source >= vertices || destination >= vertices || source < 0 || destination < 0) {
            System.out.println("Invalid vertices");
            return;
        }
        adjacencyMatrix[source][destination] = 0;
    }

    // 打印邻接矩阵
    public void printAdjacencyMatrix() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
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
        graph.addEdge(3, 4);

        System.out.println("Adjacency Matrix:");
        graph.printAdjacencyMatrix();
    }
}
