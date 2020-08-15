#
# @lc app=leetcode id=941 lang=python3
#
# [941] Valid Mountain Array
#

# @lc code=start
class Solution:
    def validMountainArray(self, A: List[int]) -> bool:
        if len(A) < 3: return False
        for i in range(len(A)-1):
            if A[i] > A[i+1]: break

        if i == 0 or i == len(A) - 1: return False
        
        while i < len(A)-1:
            if A[i] <= A[i+1]: return False
            i += 1
        
        return True
        
# @lc code=end

