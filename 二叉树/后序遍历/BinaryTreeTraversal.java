import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inorderHelper(node.left, result);
        result.add(node.val);
        inorderHelper(node.right, result);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        postorderHelper(node.left, result);
        postorderHelper(node.right, result);
        result.add(node.val);
    }

    public static void main(String[] args) {
        BinaryTreeTraversal solution = new BinaryTreeTraversal();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> inorderResult = solution.inorderTraversal(root);
        System.out.println("Inorder traversal: " + inorderResult);  // 输出: [1, 3, 2]

        List<Integer> postorderResult = solution.postorderTraversal(root);
        System.out.println("Postorder traversal: " + postorderResult);  // 输出: [3, 2, 1]
    }
}
