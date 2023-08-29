package 插入节点.指定位置加入节点;

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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Position cannot be negative.");
        }

        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Position out of bounds.");
            }
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Position out of bounds.");
        }

        newNode.next = current.next;
        current.next = newNode;
    }

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

        int positionToInsert = 1;
        linkedList.insertAtPosition(4, positionToInsert);

        linkedList.print(); // Output: 3 4 2 1
    }
}
