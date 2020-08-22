import java.util.TreeSet;

/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> topThree = new TreeSet<Integer>();
        for (int i : nums) {
            topThree.add(i);
            if (topThree.size() > 3) {
                topThree.pollFirst();
            }
        }
        if (topThree.size() == 3) {
            return topThree.first();
        } else {
            return topThree.last();
        }
    }
}
// @lc code=end

