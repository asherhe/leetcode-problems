/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merged = new ListNode();
        ListNode current = merged;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                current.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                current.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            current = current.next;
        }
        if (l1 == null) {
            while (l2 != null) {
                current.next = new ListNode(l2.val);
                current = current.next;
                l2 = l2.next;
            }
        }
        if (l2 == null) {
            while (l1 != null) {
                current.next = new ListNode(l1.val);
                current = current.next;
                l1 = l1.next;
            }
        }
        return merged.next;
    }
}
// @lc code=end

