import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    int parentIndex; // 父节点的索引
    List<Integer> childrenIndices; // 子节点的索引列表

    public TreeNode(int data, int parentIndex) {
        this.data = data;
        this.parentIndex = parentIndex;
        this.childrenIndices = new ArrayList<>();
    }

    public void addChildIndex(int childIndex) {
        childrenIndices.add(childIndex);
    }
}

public class ParentChildRepresentationTree {
    public static void main(String[] args) {
        TreeNode[] tree = new TreeNode[6];
        tree[0] = new TreeNode(1, -1);
        tree[1] = new TreeNode(2, 0);
        tree[2] = new TreeNode(3, 0);
        tree[3] = new TreeNode(4, 1);
        tree[4] = new TreeNode(5, 1);
        tree[5] = new TreeNode(6, 3);

        // 添加子节点索引
        tree[0].addChildIndex(1);
        tree[0].addChildIndex(2);
        tree[1].addChildIndex(3);
        tree[1].addChildIndex(4);
        tree[2].addChildIndex(5);

        // 打印树中每个节点的数据、父节点索引和子节点索引
        for (int i = 0; i < tree.length; i++) {
            System.out.println("Node " + i + ": Data = " + tree[i].data
                    + ", Parent Index = " + tree[i].parentIndex
                    + ", Children Indices = " + tree[i].childrenIndices);
        }
    }
}
