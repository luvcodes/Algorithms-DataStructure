package 插入节点.首位加入节点;

/**
 * 在链表头部插入节点
 * */

public class LinkedList_ {
    private Node head;

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList_ linkedList = new LinkedList_();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        // 这里输出是3，2，1就意味着数据的存储和读取顺序都是从左往右的。
        // 也就是从链表的头部开始，依次往后读取数据。
        // 在这个例子里，因为每次都是在链表的头部插入新节点，所以就是3 -> 2 -> 1
        linkedList.print();
    }
}

class Node {
    int data;
    Node next;

    /**
     * Node 类的构造函数中设置 this.next = null 的作用是确保新创建的节点初始时没有指向任何下一个节点。
     * 这是很重要的，因为在添加新节点到链表时，我们可能会修改节点的 next 引用，
     * 而初始时将其设置为 null 可以确保链表正确构建。
     * */
    public Node(int data) {
        this.data =data;
        this.next = null;
    }
}
