/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode cur = head.next;
        while (cur != null && cur.next != null) {
            ListNode newNext = cur.next.next;
            cur.next.next = odd.next;
            odd.next = cur.next;
            cur.next = newNext;
            odd = odd.next;
            cur = cur.next;
        }
        return head;
    }
}
// @lc code=end

