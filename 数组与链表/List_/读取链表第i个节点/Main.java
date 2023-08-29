class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * LinkedList 类中的 get 方法用于获取链表中特定索引位置的节点。
 * 它通过遍历链表，将 current 指针移动到第 index 个节点上，然后返回该节点。 
 * 注意，这里的索引是从 0 开始的，表示链表中的第一个元素。
 * 所以在示例中，indexToGet 为 1 表示获取第二个元素（从 0 开始计数）。
 * */
class LinkedList {
    private Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Node get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative.");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of bounds.");
            }
            current = current.next;
        }
        return current;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);

        int indexToGet = 1; // Index of the element to get
        Node nodeAtIndex = linkedList.get(indexToGet);
        if (nodeAtIndex != null) {
            System.out.println("Data at index " + indexToGet + ": " + nodeAtIndex.data);
        } else {
            System.out.println("Index out of bounds.");
        }
    }
}
