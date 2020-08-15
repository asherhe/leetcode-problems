/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start
class MinStack {
    private class Node {
        int val;
        int min;
        Node next;

        public Node(int value) {
            val = value;
        }
    }
    
    private Node start;
    private int min = Integer.MAX_VALUE;
    
    public void push(int x) {
        min = Integer.min(min, x);
        Node newNode = new Node(x);
        newNode.next = start;
        newNode.min = min;
        start = newNode;
    }
    
    public void pop() {
        start = start.next;
        min = start == null? Integer.MAX_VALUE : start.min;
    }
    
    public int top() {
        return start.val;
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

