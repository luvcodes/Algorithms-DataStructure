/**
 * 给一个非负整数x，计算并返回x的算数平方根
 * 由于返回类型是整数，结果只保留整数部分，小数部分将被舍去
 * 示例: 
 * 	x = 8
 * 	输出 2
 * 	解释: 8的算数平方根 2.82842..., 由于返回类型是整数，小数部分将被舍去
 * */

 class Solution {
 	public int mySqrt(int x) {
 		int left = 0;
 		int right = x;
 		int answer = -1;

 		while (left <= right) {
 			int mid = left + (right - left) / 2;
 			if ((long) mid * mid <= x) {
 				answer = mid;
 				left = mid + 1;
 			} else {
 				right = mid - 1;
 			}
 		}
 		return answer;
 	}
 }