import java.util.Arrays;

/*
 * @lc app=leetcode id=1051 lang=java
 *
 * [1051] Height Checker
 */

// @lc code=start
class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] ordered = heights.clone();
        Arrays.sort(ordered);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != ordered[i]) count++;
        }
        return count;
    }
}
// @lc code=end

