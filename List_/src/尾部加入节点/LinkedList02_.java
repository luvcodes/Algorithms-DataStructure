package 尾部加入节点;

/**
 * 在链表尾部加入节点
 * */

public class LinkedList02_ {
    private 首位加入节点.Node head;

    public void addLast(int data) {
        首位加入节点.Node node = new 首位加入节点.Node(data);

        if (head == null) {
            head = node;
        } else {
            首位加入节点.Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void print() {
        首位加入节点.Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList02_ linkedList02 = new LinkedList02_();
        linkedList02.addLast(1);
        linkedList02.addLast(2);
        linkedList02.addLast(3);
        linkedList02.print();
    }
}

class Node {
    int data;
    首位加入节点.Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}