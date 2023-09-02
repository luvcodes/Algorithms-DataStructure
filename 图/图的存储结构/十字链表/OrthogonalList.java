package 图.图的存储结构.十字链表;

// 主要是为了解决有向图的存储问题
class VertexNode {
    int in, out; // 入度和出度
    char data; // 顶点数据
    EdgeNode firstIn, firstOut; // 第一个入边和出边的指针
}

class EdgeNode {
    int tailVex, headVex; // 边的起点和终点
    EdgeNode headLink, tailLink; // 下一个入边和出边的指针
    int weight; // 边的权重
}

public class OrthogonalList {
    VertexNode[] vertexArray; // 顶点数组
    int vertexNum, edgeNum; // 顶点数和边数

    public OrthogonalList(int vertexNum) {
        this.vertexNum = vertexNum;
        vertexArray = new VertexNode[vertexNum];
        for (int i = 0; i < vertexNum; i++) {
            vertexArray[i] = new VertexNode();
            vertexArray[i].firstIn = null;
            vertexArray[i].firstOut = null;
        }
    }

    public void insertEdge(int start, int end, int weight) {
        EdgeNode edge = new EdgeNode();
        edge.tailVex = start;
        edge.headVex = end;
        edge.weight = weight;
        edge.headLink = vertexArray[end].firstIn;
        vertexArray[end].firstIn = edge;
        edge.tailLink = vertexArray[start].firstOut;
        vertexArray[start].firstOut = edge;
    }
}
