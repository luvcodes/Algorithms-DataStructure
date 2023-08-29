import java.util.Scanner;
import java.util.Stack;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue q1 = new Queue();
        Queue q2 = new Queue();
        Stack s = new Stack();
        int[] book = new int[10];
        int t;

        // 初始化队列
        q1.head = 1;
        q1.tail = 1;
        q2.head = 1;
        q2.tail = 1;

        // 初始化栈
        s.push(0);

        // 初始化标记数组
        for (int i = 1; i <= 9; i++) {
            book[i] = 0;
        }

        // 小哼手上的6张牌
        for (int i = 1; i <= 6; i++) {
            q1.data[q1.tail] = scanner.nextInt();
            q1.tail++;
        }

        // 小哈手上的6张牌
        for (int i = 1; i <= 6; i++) {
            q2.data[q2.tail] = scanner.nextInt();
            q2.tail++;
        }

        while (q1.head < q1.tail && q2.head < q2.tail) {
            t = q1.data[q1.head]; // 小哼出一张牌

            if (book[t] == 0) {
                q1.head++;
                s.push(t);
                book[t] = 1;
            } else {
                q1.head++;
                q1.data[q1.tail] = t;
                q1.tail++;
                while ((int) s.peek() != t) {
                    book[(int) s.peek()] = 0;
                    q1.data[q1.tail] = (int) s.pop();
                    q1.tail++;
                }
                s.pop();
            }

            t = q2.data[q2.head]; // 小哈出一张牌

            if (book[t] == 0) {
                q2.head++;
                s.push(t);
                book[t] = 1;
            } else {
                q2.head++;
                q2.data[q2.tail] = t;
                q2.tail++;
                while ((int) s.peek() != t) {
                    book[(int) s.peek()] = 0;
                    q2.data[q2.tail] = (int) s.pop();
                    q2.tail++;
                }
                s.pop();
            }
        }

        if (q2.head == q2.tail) {
            System.out.println("小哼win");
            System.out.print("小哼当前手中的牌是");
            for (int i = q1.head; i <= q1.tail - 1; i++) {
                System.out.print(" " + q1.data[i]);
            }
            if (s.size() > 0) {
                System.out.print("\n桌上的牌是");
                for (int i = 0; i < s.size(); i++) {
                    System.out.print(" " + s.get(i));
                }
            } else {
                System.out.println("\n桌上已经没有牌了");
            }
        } else {
            System.out.println("小哈win");
            System.out.print("小哈当前手中的牌是");
            for (int i = q2.head; i <= q2.tail - 1; i++) {
                System.out.print(" " + q2.data[i]);
            }
            if (s.size() > 0) {
                System.out.print("\n桌上的牌是");
                for (int i = 0; i < s.size(); i++) {
                    System.out.print(" " + s.get(i));
                }
            } else {
                System.out.println("\n桌上已经没有牌了");
            }
        }

        scanner.close();
    }
}

class Queue {
    int[] data = new int[100];
    int head;
    int tail;
}
