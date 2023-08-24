import java.util.Scanner;

public class practiceSort {
    public static void main(String[] args) {
        int[] a = new int[101];
        int n, i, j, t;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt(); // 读入n
        for (i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }

        // 开始冒泡排序
        for (i = 1; i <= n - 1; i++) {
            for (j = 1; j <= n - i; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        
        System.out.print(a[1] + " "); // 输出第1个数
        for (i = 2; i <= n; i++) {
            if (a[i] != a[i - 1]) { // 如果当前这个数是第一次出现则输出
                System.out.print(a[i] + " ");
            }
        }
    }
}
