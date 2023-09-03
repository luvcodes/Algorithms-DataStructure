class ThreadedBinaryNode {
    int data;
    ThreadedBinaryNode left, right;
    boolean leftThread, rightThread;

    public ThreadedBinaryNode(int data) {
        this.data = data;
        left = null;
        right = null;
        leftThread = false;
        rightThread = false;
    }
}

public class ThreadedBinaryTree {
    private ThreadedBinaryNode root;

    public ThreadedBinaryTree() {
        root = null;
    }

    // 进行中序线索化
    private void threadedInorder(ThreadedBinaryNode node, ThreadedBinaryNode prev) {
        if (node != null) {
            threadedInorder(node.left, prev);

            if (node.left == null) {
                node.left = prev;
                node.leftThread = true;
            }
            
            if (prev != null && prev.right == null) {
                prev.right = node;
                prev.rightThread = true;
            }

            prev = node;

            threadedInorder(node.right, prev);
        }
    }

    // 中序遍历线索二叉树
    public void inorderTraversal() {
        ThreadedBinaryNode node = root;
        while (node != null) {
            while (node.leftThread) {
                node = node.left;
            }
            
            System.out.print(node.data + " ");

            while (node.rightThread) {
                node = node.right;
                System.out.print(node.data + " ");
            }

            node = node.right;
        }
    }

    // 插入节点
    public void insert(int data) {
        ThreadedBinaryNode newNode = new ThreadedBinaryNode(data);
        if (root == null) {
            root = newNode;
            return;
        }

        ThreadedBinaryNode current = root;
        while (true) {
            if (data < current.data) {
                if (current.leftThread) {
                    newNode.left = current.left;
                    newNode.leftThread = true;
                    current.left = newNode;
                    current.leftThread = false;
                    return;
                }
                current = current.left;
            } else {
                if (current.rightThread) {
                    newNode.right = current.right;
                    newNode.rightThread = true;
                    current.right = newNode;
                    current.rightThread = false;
                    return;
                }
                current = current.right;
            }
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

        // 进行中序线索化
        tree.threadedInorder(tree.root, null);

        // 中序遍历线索二叉树
        System.out.println("Inorder Traversal:");
        tree.inorderTraversal();
    }
}
