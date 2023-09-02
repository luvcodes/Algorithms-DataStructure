package 代码随想录示例.区间左闭右闭;

public class BinarySearch {

}

class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                // 更新左区间的右边界
                // 应该是right = mid还是right = mid - 1
                // 因为已经判断了nums[mid] > target。 所以这个区间一定不包含mid这个index
                // 如果不用mid - 1那么实际上就是相当于把while循环条件里明确定义了不包含的值放到了循环体内，一定是会出现问题的。
                right = mid - 1;
            } else if (nums[mid] < target) {
                // 这里同上面的right同理
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
