	class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            long square = (long) mid * mid;
            if (square < num) {
                left = mid + 1;
            } else if (square > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}

// class Solution {
//     public boolean isPerfectSquare(int num) {
//         long x = 1, square = 1;
//         while (square <= num) {
//             if (square == num) {
//                 return true;
//             }
//             ++x;
//             square = x * x;
//         }
//         return false;
//     }
// }