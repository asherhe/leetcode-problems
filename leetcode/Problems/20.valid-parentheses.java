import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> checkStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                checkStack.push(')');
            } else if (c == '[') {
                checkStack.push(']');
            } else if (c == '{') {
                checkStack.push('}');
            } else {
                if (checkStack.isEmpty() || checkStack.pop() != c) return false;
            }
        }
        return checkStack.isEmpty();
    }
}
// @lc code=end

