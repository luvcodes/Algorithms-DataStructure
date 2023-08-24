import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void bucketSort(double[] arr) {
        int n = arr.length;
        
        // 创建桶并初始化
        ArrayList<Double>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Double>();
        }
        
        // 将元素放入对应的桶中
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }
        
        // 对每个桶内的元素进行排序
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        
        // 合并桶中的元素
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {0.3, 0.1, 0.8, 0.5, 0.2, 0.7};
        
        System.out.println("原数组：");
        for (double num : arr) {
            System.out.print(num + " ");
        }
        
        bucketSort(arr);
        
        System.out.println("\n排序后：");
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
}
