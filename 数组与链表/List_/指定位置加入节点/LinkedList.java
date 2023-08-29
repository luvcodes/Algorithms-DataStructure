package 指定位置加入节点;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data); // 创建新节点
        if (position == 0) {
            newNode.next = head; // 插入位置为0，直接将头节点指向新节点
            head = newNode; // 更新头节点为新节点
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next; // 移动到指定位置前一个节点
            }
            if (current != null) {
                newNode.next = current.next; // 新节点的下一个节点是前一个节点的下一个节点
                current.next = newNode; // 更新前一个节点的指针为新节点
            }
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtPosition(1, 0);
        linkedList.insertAtPosition(3, 1);
        linkedList.insertAtPosition(2, 1);

        System.out.println("Linked List after inserting at position:");
        linkedList.display(); // 输出：1 2 3
    }
}
