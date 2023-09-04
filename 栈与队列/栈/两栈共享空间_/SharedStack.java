package 两栈共享空间_;

public class SharedStack {
    private int maxSize;
    private int[] array;
    private int top1;
    private int top2;

    public SharedStack(int maxSize) {
        this.maxSize = maxSize;
        this.array = new int[maxSize];
        this.top1 = -1; // 初始化第一个栈的栈顶指针
        this.top2 = maxSize; // 初始化第二个栈的栈顶指针
    }

    public void pushToStack1(int value) {
        if (top1 + 1 < top2) {
            array[++top1] = value;
        } else {
            System.out.println("Stack 1 is full.");
        }
    }

    public void pushToStack2(int value) {
        if (top2 - 1 > top1) {
            array[--top2] = value;
        } else {
            System.out.println("Stack 2 is full.");
        }
    }

    public int popFromStack1() {
        if (top1 >= 0) {
            return array[top1--];
        } else {
            System.out.println("Stack 1 is empty.");
            return -1;
        }
    }

    public int popFromStack2() {
        if (top2 < maxSize) {
            return array[top2++];
        } else {
            System.out.println("Stack 2 is empty.");
            return -1;
        }
    }

    public static void main(String[] args) {
        SharedStack sharedStack = new SharedStack(10);

        sharedStack.pushToStack1(1);
        sharedStack.pushToStack1(2);
        sharedStack.pushToStack2(11);
        sharedStack.pushToStack2(12);

        System.out.println("Pop from Stack 1: " + sharedStack.popFromStack1());
        System.out.println("Pop from Stack 2: " + sharedStack.popFromStack2());
    }
}
