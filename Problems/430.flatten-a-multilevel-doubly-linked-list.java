/*
 * @lc app=leetcode id=430 lang=java
 *
 * [430] Flatten a Multilevel Doubly Linked List
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

/*
Thought Process:
Iterate through until child is not null, then recurse on it.
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        Node flattened = new Node();
        Node current = flattened;
        while (head != null) {
            current.next = new Node();
            current.next.val = head.val;
            current.next.prev = current;
            current = current.next;
            if (head.child != null) {
                current.next = flatten(head.child);
                current.next.prev = current;
                while (current.next != null) {
                    current = current.next;
                }
            }
            head = head.next;
        }
        flattened.next.prev = null;
        return flattened.next;
    }
}
// @lc code=end

