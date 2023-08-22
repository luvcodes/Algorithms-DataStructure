package 尾部加入节点;

/**
 * 在链表尾部加入节点
 */
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data); // 创建新节点
        if (head == null) {
            head = newNode; // 如果链表为空，直接将头节点指向新节点
        } else {
            newNode.next = head; // 新节点的下一个节点是原来的头节点
            head = newNode; // 更新头节点指针为新节点
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
        linkedList.insertAtHead(3);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(1);

        System.out.println("Linked List after inserting at head:");
        linkedList.display(); // 输出：1 2 3
    }
}