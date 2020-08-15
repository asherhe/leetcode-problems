/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // First pass: Duplicate all nodes
        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.val);
            newNode.next = current.next;
            current.next = newNode;
            current = current.next.next;
        }

        // Second pass: Copy over the random fields
        current = head;
        while (current != null) {
            if (current.random != null) current.next.random = current.random.next;
            current = current.next.next;
        }

        // Third pass: Separate copies
        current = head;
        Node copied = new Node(-1);
        Node curr = copied;
        while (current != null) {
            curr.next = current.next;
            current.next = current.next.next;
            curr = curr.next;
            current = current.next;
        }
        
        return copied.next;
    }
}
// @lc code=end

