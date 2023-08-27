# 该模板的好处
# 普适性 & 通用性
# 循环条件结束清晰 left + 1 < right
# left / right = mid 不用向加1不加1
# 不会死循环

class Solution:
	def binary_search(self, nums: List[int], target: int) -> int:
		if len(nums) == 0:
			return -1
		# 1. initialize
		left = 0
		right = len(nums) - 1

		# 2. 循环结束条件 left + 1 == right
		while left + 1 < right:
			# 不要用(left + right)//2?
			mid = left + (right - left) // 2
			if nums[mid] == target:
				return mid
			elif nums[mid] < target:
				left = mid # 直接等于mid
			else: 
				right = mid # 直接等于mid

		# 3. 出循环left + 1 == right 再判断这两个特殊的case
		if nums[left] == target:
			return left
		elif nums[right] == target:
			return right
		else:
			return -1 # 没有找到