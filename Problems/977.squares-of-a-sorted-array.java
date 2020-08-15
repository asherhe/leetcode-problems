/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        if (A.length == 1) result[0] = A[0] * A[0];
        int negPointer = 0;
        int posPointer = A.length - 1;
        while (negPointer <= posPointer) {
            if (A[negPointer] >= 0) {
                for (int i = 0; i <= posPointer - negPointer; i++) {
                    result[i] = A[negPointer + i] * A[negPointer + i];
                }
                break;
            } else if (A[posPointer] <= 0) {
                for (int i = 0; i <= posPointer - negPointer; i++) {
                    result[i] = A[posPointer - i] * A[posPointer - i];
                }
                break;
            } else if (-A[negPointer] >= A[posPointer]) {
                result[posPointer - negPointer] = A[negPointer] * A[negPointer];
                negPointer++;
            } else {
                result[posPointer - negPointer] = A[posPointer] * A[posPointer];
                posPointer--;
            }
        }
        return result;
    }
}
// @lc code=end

