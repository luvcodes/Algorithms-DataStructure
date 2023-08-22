package Initialize_;

import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {
        // 创建一个栈
        Stack<Integer> stack = new Stack<>();

        // 入栈操作
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 出栈操作
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // 获取栈顶元素但不移除
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // 判断栈是否为空
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
    }
}
