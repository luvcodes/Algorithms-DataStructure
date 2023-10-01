public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 1, 6, 3, 7, 4};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // 将 arr[i] 插入到 arr[0], arr[1], ..., arr[i-1] 中，使之成为有序数组
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
