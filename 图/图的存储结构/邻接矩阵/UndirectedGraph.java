public class UndirectedGraph {
    private int[][] adjMatrix;
    private int numVertices;

    public UndirectedGraph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    // 添加边
    public void addEdge(int i, int j) {
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices) {
            adjMatrix[i][j] = 1;
            adjMatrix[j][i] = 1;
        }
    }

    // 删除边
    public void removeEdge(int i, int j) {
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices) {
            adjMatrix[i][j] = 0;
            adjMatrix[j][i] = 0;
        }
    }

    // 打印邻接矩阵
    public void printMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.printMatrix();
    }
}
