public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // 获取基准元素的索引
            quickSort(arr, low, pivotIndex - 1); // 对基准元素的左边部分进行递归排序
            quickSort(arr, pivotIndex + 1, high); // 对基准元素的右边部分进行递归排序
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 选择数组最后一个元素作为基准元素
        int i = low - 1; // i 用于记录小于基准的元素的位置
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // 交换 arr[i] 和 arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // 将基准元素放置到合适的位置（i+1）
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1; // 返回基准元素的索引
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("原数组：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        
        System.out.println("\n排序后：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
