#
# @lc app=leetcode id=26 lang=python3
#
# [26] Remove Duplicates from Sorted Array
#

# @lc code=start
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        for j in nums:
            if nums[i] != j:
                i += 1
                nums[i] = j
        return i + 1

    def removeDuplicates2(self, nums: List[int]) -> int:
        # Iterate through all elements in nums
        i = 0
        while i < len(nums):
            # Check if current number is in nums (excluding itself)
            if nums[i] in nums[:i] + nums[i+1:]:
                del nums[i]
                i -= 1
            i += 1
        return len(nums)

# @lc code=end

