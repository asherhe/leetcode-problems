#
# @lc app=leetcode id=1346 lang=python3
#
# [1346] Check If N and Its Double Exist
#

# @lc code=start
class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        # A Brute-Force solution to this problem
        for i in range(len(arr)):
            # Search for the index of arr[i]*2
            search = Solution.__search(arr, arr[i]*2)
            # Check if search is successful
            if search != -1 and search != i:
                return True
        return False
    
    @staticmethod
    def __search(arr, target):
        for i in range(len(arr)):
            if arr[i] == target:
                return i
        return -1
# @lc code=end

