#
# @lc app=leetcode id=1299 lang=python3
#
# [1299] Replace Elements with Greatest Element on Right Side
#

# @lc code=start
class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        # Keep track of current maximum
        currentMax = -1
        # Loop backwards
        for i in range(len(arr)-1, 0, -1):
            if arr[i] > currentMax:
                currentMax = arr[i]
            arr[i] = currentMax
        # Shift array over by one, then set the last value
        arr[:-1] = arr[1:]
        arr[-1] = -1
        return arr

# @lc code=end

