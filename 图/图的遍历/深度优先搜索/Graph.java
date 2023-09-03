import java.util.*;

public class Graph {
    private int V;   // 顶点的数量
    private LinkedList<Integer> adjList[]; // 邻接表

    // 构造函数
    Graph(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adjList[i] = new LinkedList();
    }

    // 添加一个边到图中
    void addEdge(int v, int w) {
        adjList[v].add(w);  // 添加w到v的列表
    }

    // 从v开始的DFS
    void DFSUtil(int v, boolean visited[]) {
        // 标记当前节点为已访问
        visited[v] = true;
        System.out.print(v + " ");

        // 递归访问所有邻接和未访问的顶点
        Iterator<Integer> i = adjList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // DFS遍历函数
    void DFS(int v) {
        // 标记所有顶点为未访问
        boolean visited[] = new boolean[V];

        // 调用递归辅助函数开始DFS
        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("从顶点2开始的深度优先遍历：");

        g.DFS(2);
    }
}
