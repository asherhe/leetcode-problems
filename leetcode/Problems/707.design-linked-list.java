/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 */

// @lc code=start
class MyLinkedList {
    private class Node {
        public int value;
        public Node prev;
        public Node next;
        
        public Node(int val) {
            value = val;
        }

        public Node(int val, Node prevNode, Node nextNode) {
            value = val;
            prev = prevNode;
            next = nextNode;
        }
    }
    
    private Node first;
    private int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        first = null;
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (size == 0) {
            first = new Node(val);
        } else {
            first = new Node(val, null, first);
            first.next.prev = first;
        }
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (size == 0) {
            first = new Node(val);
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(val, current, null);
        }
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        else if (index <= 0) addAtHead(val);
        else {
            size++;
            Node current = first;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            current.next = new Node(val, current, current.next);
            if (current.next.next != null) {
                current.next.next.prev = current.next;
            }
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        } else if (index == 0) {
            first = first.next;
        } else {
            Node current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

