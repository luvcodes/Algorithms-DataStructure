import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    List<TreeNode> children;

    public TreeNode(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }
}

public class ChildRepresentationTree {
    public static void main(String[] args) {
        // 创建一个简单的树
        TreeNode root = new TreeNode(1);
        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(3);
        TreeNode child3 = new TreeNode(4);

        root.addChild(child1);
        root.addChild(child2);
        child1.addChild(child3);

        // 打印树的结构
        printTree(root, 0);
    }

    public static void printTree(TreeNode node, int level) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indent.append("  ");
        }
        System.out.println(indent.toString() + "Node: " + node.data);

        for (TreeNode child : node.children) {
            printTree(child, level + 1);
        }
    }
}
