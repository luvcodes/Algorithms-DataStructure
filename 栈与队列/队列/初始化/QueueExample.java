package Initialize_;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // 添加元素到队列
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // 打印队列中的元素
        System.out.println("Queue: " + queue);

        // 获取队首元素并移除
        int frontElement = queue.poll();
        System.out.println("Removed element: " + frontElement);
        System.out.println("Queue after removal: " + queue);

        // 获取队首元素但不移除
        int peekElement = queue.peek();
        System.out.println("Peeked element: " + peekElement);
        System.out.println("Queue after peek: " + queue);
    }
}

// // "static void main" must be defined in a public class.
// public class Main {
//     public static void main(String[] args) {
//         // 1. Initialize a queue.
//         Queue<Integer> q = new LinkedList();
//         // 2. Get the first element - return null if queue is empty.
//         System.out.println("The first element is: " + q.peek());
//         // 3. Push new element.
//         q.offer(5);
//         q.offer(13);
//         q.offer(8);
//         q.offer(6);
//         // 4. Pop an element.
//         q.poll();
//         // 5. Get the first element.
//         System.out.println("The first element is: " + q.peek());
//         // 7. Get the size of the queue.
//         System.out.println("The size is: " + q.size());
//     }
// }
