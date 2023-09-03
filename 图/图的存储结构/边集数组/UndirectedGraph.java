public class UndirectedGraph {
    private int[][] edges;

    public UndirectedGraph(int[][] edges) {
        this.edges = edges;
    }

    public void printEdges() {
        System.out.println("Undirected Edges:");
        for (int i = 0; i < edges.length; i++) {
            System.out.println("Edge between " + edges[i][0] + " and " + edges[i][1]);
        }
    }

    public static void main(String[] args) {
        // edges[i][0] 和 edges[i][1] 是无向边的两个端点
        int[][] edges = {
            {0, 1},
            {1, 2},
            {2, 0},
            {2, 3}
        };
        UndirectedGraph graph = new UndirectedGraph(edges);
        graph.printEdges();
    }
}
