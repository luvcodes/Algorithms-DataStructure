class Solution {
	public int search(int[] nums, int target) {
		if (nums.length == 0) {
			return -1;
		}

		int left = 0;
		int right = nums.length - 1;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			// 条件判断
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid;
			} else {
				right = mid;
			}
		}

		if (nums[left] == target) {
			return left;
		} else if (nums[right] == target) {
			return right;
		} else {
			return -1;
		}
	}
}