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
        adjList[v].add(w);
    }

    // 从s开始的BFS
    void BFS(int s) {
        // 标记所有顶点为未访问
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // 标记当前节点为已访问并入队
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // 出队一个顶点并打印
            s = queue.poll();
            System.out.print(s + " ");

            // 访问所有邻接和未访问的顶点
            Iterator<Integer> i = adjList[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("从顶点2开始的广度优先遍历：");

        g.BFS(2);
    }
}
