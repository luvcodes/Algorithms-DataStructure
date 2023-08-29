class TreeNode {
    int data;
    int parentIndex; // 父节点在数组中的索引

    public TreeNode(int data, int parentIndex) {
        this.data = data;
        this.parentIndex = parentIndex;
    }
}

public class ParentRepresentationTree {
    public static void main(String[] args) {
        // 创建一个简单的树
        TreeNode[] tree = new TreeNode[6];
        tree[0] = new TreeNode(1, -1); // 根节点，没有父节点
        tree[1] = new TreeNode(2, 0);  // 第二个节点，父节点为0
        tree[2] = new TreeNode(3, 0);
        tree[3] = new TreeNode(4, 1);
        tree[4] = new TreeNode(5, 1);
        tree[5] = new TreeNode(6, 3);

        // 打印树中每个节点的数据和父节点索引
        for (int i = 0; i < tree.length; i++) {
            System.out.println("Node " + i + ": Data = " + tree[i].data + ", Parent Index = " + tree[i].parentIndex);
        }
    }
}
