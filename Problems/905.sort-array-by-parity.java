/*
 * @lc app=leetcode id=905 lang=java
 *
 * [905] Sort Array By Parity
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] A) {
        for (int cur = 0, swap = 0; cur < A.length; cur++) {
            if (A[cur] % 2 == 1) continue;
            if (swap == cur){
                swap++;
                continue;
            }
            A[cur] += A[swap];
            A[swap] = A[cur] - A[swap];
            A[cur] -= A[swap];
            
            swap++;
        }
        return A;
    }
}
// @lc code=end

