/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    private ListNode ref;
    public boolean isPalindrome(ListNode head) {
        ref = head;
        return checkEquivalent(head);
    }

    private boolean checkEquivalent(ListNode current) {
        if (current == null) return true;
        boolean restOfList = checkEquivalent(current.next);
        boolean currentEqual = current.val == ref.val;
        ref = ref.next;
        return restOfList && currentEqual;
    }
}
// @lc code=end

