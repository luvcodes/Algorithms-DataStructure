package 顺序查找;

public class SequentialSearchWithSentinel {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;

        int index = sequentialSearchWithSentinel(array, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int sequentialSearchWithSentinel(int[] array, int target) {
        int n = array.length;
        int[] newArray = new int[n + 1];
        System.arraycopy(array, 0, newArray, 0, n);
        newArray[n] = target;  // 设置哨兵

        int i = 0;
        while (newArray[i] != target) {
            i++;
        }

        return (i < n) ? i : -1;
    }
}
