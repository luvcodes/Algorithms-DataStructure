public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // 如果这一轮没有发生交换，说明数组已经有序，可以提前退出循环
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("原数组：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        bubbleSort(arr);
        
        System.out.println("\n排序后：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}