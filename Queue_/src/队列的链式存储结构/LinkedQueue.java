class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedQueue<T> {
    private Node<T> front; // 队首节点
    private Node<T> rear;  // 队尾节点

    public LinkedQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            rear = null; // 若队列为空，同时更新rear指针
        }
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }
}

public class LinkedQueue {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.enqueue(40);
        queue.enqueue(50);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
