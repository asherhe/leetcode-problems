/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        for (int copy = 0, cursor = 0; cursor < nums.length; cursor++) {
            if (nums[cursor] == 0) continue;
            if (copy == cursor){
                copy++;
                continue;
            }
            nums[copy++] = nums[cursor];
            nums[cursor] = 0;
        }
    }
}
// @lc code=end