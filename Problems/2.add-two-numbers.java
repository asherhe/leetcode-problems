/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        ListNode current = sum;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 == null && l2 == null) {
                current.next = new ListNode(carry);
            } else if (l1 == null) {
                current.next = new ListNode(l2.val + carry);                
                l2 = l2.next;
            } else if (l2 == null) {
                current.next = new ListNode(l1.val + carry);                
                l1 = l1.next;
            } else {
                current.next = new ListNode(l1.val + l2.val + carry);
                l1 = l1.next;
                l2 = l2.next;
            }
            carry = current.next.val / 10;
            current.next.val %= 10;
            current = current.next;
        }
        return sum.next;
    }
}
// @lc code=end

