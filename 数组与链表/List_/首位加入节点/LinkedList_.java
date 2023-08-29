package 首位加入节点;

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
        linkedList.print();
    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data =data;
        this.next = null;
    }
}
