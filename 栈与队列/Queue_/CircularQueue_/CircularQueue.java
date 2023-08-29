package CircularQueue_;

class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);

        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);

        System.out.println("Dequeued: " + circularQueue.dequeue());
        System.out.println("Dequeued: " + circularQueue.dequeue());

        System.out.println("Whats Empty?");
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);

        while (!circularQueue.isEmpty()) {
            System.out.println("Dequeued: " + circularQueue.dequeue());
        }
    }
}
