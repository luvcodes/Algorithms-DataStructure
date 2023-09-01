/**
 * 前序遍历
 * */

// 定义二叉树节点类
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class PreorderTraversal {
    // 前序遍历函数
    public static void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " "); // 访问根节点
            preorderTraversal(node.left); // 递归遍历左子树
            preorderTraversal(node.right); // 递归遍历右子树
        }
    }

    public static void main(String[] args) {
        // 创建二叉树示例
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // 调用前序遍历函数
        System.out.println("Preorder traversal:");
        preorderTraversal(root);
    }
}
