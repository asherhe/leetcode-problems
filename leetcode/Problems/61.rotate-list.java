/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Check for base case
        if (k == 0) return head;
        // Check if rotation is actually required
        if (head == null || head.next == null) return head;
        
        // Find the node before the last node,
        // also determine length in the process
        ListNode beforeLast = head;
        int length = 2;
        while (beforeLast.next.next != null) {
            beforeLast = beforeLast.next;
            length += 1;
        }

        // Do one rotation
        beforeLast.next.next = head;
        head = beforeLast.next;
        beforeLast.next = null;

        // Recurse, also reduce recursion count
        // to prevent StackOverflowError (i.e.
        // Too many recursive calls)
        return rotateRight(head, (k - 1) % length);
    }
}

// @lc code=end

