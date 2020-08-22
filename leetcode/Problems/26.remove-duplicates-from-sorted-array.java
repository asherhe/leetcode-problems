/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        // Two pointers for copying and pasting (scan is in for loop)
        int copyPos = 0;
        for (int scan = 0; scan < nums.length; scan++) {
            // Check if the two are now unequal
            if (nums[copyPos] != nums[scan]) {
                nums[++copyPos] = nums[scan];
            }
        }
        // Return the length
        return copyPos + 1;
    }
}
// @lc code=end

