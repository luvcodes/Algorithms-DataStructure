public class DirectedGraph {
    private int[][] edges;

    public DirectedGraph(int[][] edges) {
        this.edges = edges;
    }

    public void printEdges() {
        System.out.println("Directed Edges:");
        for (int i = 0; i < edges.length; i++) {
            System.out.println("Edge from " + edges[i][0] + " to " + edges[i][1]);
        }
    }

    public static void main(String[] args) {
        // edges[i][0] 是起点，edges[i][1] 是终点
        int[][] edges = {
            {0, 1},
            {1, 2},
            {2, 0},
            {2, 3}
        };
        DirectedGraph graph = new DirectedGraph(edges);
        graph.printEdges();
    }
}
