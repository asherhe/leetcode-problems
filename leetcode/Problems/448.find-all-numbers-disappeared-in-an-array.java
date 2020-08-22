import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i : nums) {
            nums[Math.abs(i)-1] = -Math.abs(nums[Math.abs(i)-1]);
        }
        ArrayList<Integer> missing = new ArrayList<Integer>();
        for (int i : nums) {
            if (Math.signum(i) == 1) {
                missing.add(i);
            }
        }
        return missing;
    }
}
// @lc code=end

