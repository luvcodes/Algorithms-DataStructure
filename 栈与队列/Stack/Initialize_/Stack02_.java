package Initialize_;

import java.util.Deque;
import java.util.ArrayDeque;

public class Stack02_ {
    public static void main(String[] args) {
        // 创建一个双端队列作为栈
        Deque<Integer> stack = new ArrayDeque<>();

        // 入栈操作（使用 addFirst 或 push 都可以）
        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);

        // 出栈操作（使用 removeFirst 或 pop 都可以）
        int poppedElement = stack.removeFirst();
        System.out.println("Popped element: " + poppedElement);

        // 获取栈顶元素但不移除
        int topElement = stack.peekFirst();
        System.out.println("Top element: " + topElement);

        // 判断栈是否为空
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
    }
}
