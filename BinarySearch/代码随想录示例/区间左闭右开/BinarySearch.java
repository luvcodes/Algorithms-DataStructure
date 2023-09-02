package 代码随想录示例.区间左闭右开;

public class BinarySearch {

}

class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        // 因为现在要验证左闭右开的情况
        // 所以left和right肯定不能相等
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                // 这里就得包括上mid的情况
                // 因为right本来就没有包括在这个"左闭右开"的情况下
                // 所以需要包括上mid
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
