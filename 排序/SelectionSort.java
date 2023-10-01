public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 1, 6, 3, 7, 4};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // 找到从 i 到 n-1 中最小的元素
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 如果 minIndex 不是 i，交换 arr[i] 和 arr[minIndex]
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
