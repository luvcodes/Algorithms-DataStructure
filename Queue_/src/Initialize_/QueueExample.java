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
