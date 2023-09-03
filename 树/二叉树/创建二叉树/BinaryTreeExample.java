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

public class BinaryTreeExample {
    public static void main(String[] args) {
        // 创建根节点
        TreeNode root = new TreeNode(1);
        
        // 添加左子节点和右子节点
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        // 添加左子节点的子节点
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        // 输出二叉树
        System.out.println("Preorder traversal:");
        preorderTraversal(root);
    }
    
    // 前序遍历
    public static void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }
}
