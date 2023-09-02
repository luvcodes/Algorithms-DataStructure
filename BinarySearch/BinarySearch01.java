package BinarySearch;

class BinarySearch01 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6};
        int target = 2;
        binarySearch(nums, 2);
    }


    public static int binarySearch(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        // 1. initialize
        int left = 0;
        int right = nums.length - 1;

        // 2. 循环结束条件 left + 1 == right
        while (left + 1 < right) {
            // 不要用(left + right)//2?
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid; // 直接等于mid
            } else {
                right = mid; // 直接等于mid
            }
        }

        // 3. 出循环left + 1 == right 再判断这两个特殊的case
        /**
         * 这样的情况会出现比如说while的条件就不满足了，比如[1,2,3]中，target = -1
         * 这样就会直接在某个步骤退出循环，所以需要下面这段if statement来进行判断
         * */
        if (nums[left] == target) {
            return left;
        } else if (nums[right] == target) {
            return right;
        } else {
            return -1; // 没有找到
        }
    }

}

