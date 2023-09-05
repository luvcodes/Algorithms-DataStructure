package 插入节点.尾部加入节点;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    // 头部添加节点
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /**
     * 当你要在链表的尾部添加一个新节点时，需要考虑当前链表是否为空。
     * - 如果链表为空，直接将新节点设置为链表的唯一节点（也就是头节点），然后链表的尾部也就是头部。
     * - 如果链表不为空，你需要遍历链表，找到当前链表的最后一个节点，然后将新节点连接到最后一个节点的 next 引用上，
     *   以使其成为链表中的最后一个节点。
     * */
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        /**
         * 在循环中，通过 current 遍历链表，直到找到最后一个节点（即 current.next 为 null）
         * */
        while (current.next != null) {
            current = current.next;
        }
        // 将 newNode 的引用赋给 current.next，这样新节点就连接到了链表的最后一个节点
        current.next = newNode;
    }

    // 打印函数
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);

        linkedList.print(); // Output: 3 2 1

        linkedList.addLast(4);
        linkedList.addLast(5);

        linkedList.print(); // Output: 3 2 1 4 5
    }
}
