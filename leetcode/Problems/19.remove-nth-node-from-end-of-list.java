/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Main idea: Keep nth and last
        // n nodes apart, when last.next
        // is null, then remove the nth node
        // from the end
        if (head.next == null) {
            return null;
        }
        ListNode nth = head;
        ListNode last = head;
        while (n > 0) {
            if (last.next == null) {
                return head.next;
            }
            n--;
            last = last.next;
        }
        while (last.next != null) {
            last = last.next;
            nth = nth.next;
        }
        nth.next = nth.next.next;
        return head;
    }
}
// @lc code=end

