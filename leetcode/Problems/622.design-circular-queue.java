/*
 * @lc app=leetcode id=622 lang=java
 *
 * [622] Design Circular Queue
 */

// @lc code=start
class MyCircularQueue {
    // Store the whole queue
    private int[] queue;
    // Stores the index of the start of the queue
    private int head = 0;
    // Stores the index of the tail of the queue
    private int tail = 0;
    // Stores the length of the queue
    private int length = 0;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        // Just construct a new array
        queue = new int[k];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        // Check if the queue is full
        if (isFull()) return false;

        // Increment the tail, maintain that it is still
        // in the bounds of the queue
        tail++;
        tail %= queue.length;
        // Add the value
        queue[tail] = value;

        length++;

        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        // Check if the operation is possible
        if (isEmpty()) return false;
        // Increment the head, maintain that it is still
        // in the bounds of the queue
        head++;
        head %= queue.length;
        length--;

        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()) return -1;
        else return queue[head];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) return -1;
        else return queue[tail];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return length == 0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return length == queue.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
// @lc code=end

