/**
 * 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * 
    示例 1：
    输入：nums1 = [1,2,2,1], nums2 = [2,2]
    输出：[2]

    示例 2：
    输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    输出：[9,4]
    解释：[4,9] 也是可通过的
 * 
 * */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // 1. 比较两个数组的长度
        // 2. 较长的数组进行二分查找，每次二分之后，都遍历较短的数组，和二分之后的另一半数组进行对比

        // 或者是强行遍历
        /**
        直观的方法是遍历数组 nums1，对于其中的每个元素，遍历数组 nums2 判断该元素是否在数组 nums2
        中，如果存在，则将该元素添加到返回值。假设数组 nums1 和 nums2 的长度分别是 m 和 n，则遍历
        数组 nums1 需要 O(m) 的时间，判断 nums1 中的每个元素是否在数组 nums2 中需要 O(n)的时间，因此
        总时间复杂度是 O(mn)
         */
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        
        return getIntersection(set1, set2);
    }

    public int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {
        if (set1.size() > set2.size()) {
            return getIntersection(set2, set1);
        }

        // HashSet that contains the common elements
        Set<Integer> intersectionSet = new HashSet<Integer>();
        for (int num : set1) {
            if (set2.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Since the required return type is an array
        // copy the result from the above HashSet to the array
        int[] intersection = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersection[index++] = num;
        }
        return intersection;
    }
}