package AddElement_;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // 创建一个队列，使用LinkedList来实现
        Queue<Integer> queue = new LinkedList<>();

        // 添加元素到队列
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // 打印队列中的元素
        System.out.println("Queue: " + queue);
    }
}
