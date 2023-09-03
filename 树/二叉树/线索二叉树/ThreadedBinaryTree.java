class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    boolean leftThread;
    boolean rightThread;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
        leftThread = false;
        rightThread = false;
    }
}

public class ThreadedBinaryTree {
    private TreeNode root;
    private TreeNode prev;

    public ThreadedBinaryTree() {
        root = null;
        prev = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void buildThreads() {
        prev = null;
        buildThreadsRec(root);
    }

    private void buildThreadsRec(TreeNode node) {
        if (node == null) {
            return;
        }

        buildThreadsRec(node.left);

        if (node.left == null) {
            node.left = prev;
            node.leftThread = true;
        }

        if (prev != null && prev.right == null) {
            prev.right = node;
            prev.rightThread = true;
        }

        prev = node;

        buildThreadsRec(node.right);
    }

    public void inOrderTraversal() {
        TreeNode current = leftMost(root);

        while (current != null) {
            System.out.print(current.data + " ");
            current = inorderSuccessor(current);
        }
    }

    private TreeNode leftMost(TreeNode node) {
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }

    private TreeNode inorderSuccessor(TreeNode node) {
        if (node.rightThread) {
            return node.right;
        } else {
            return leftMost(node.right);
        }
    }

    public static void main(String[] args) {
        ThreadedBinaryTree tree = new ThreadedBinaryTree();
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);

        tree.buildThreads();
        tree.inOrderTraversal(); // Output: 1 2 3 4 5 6 7
    }
}
