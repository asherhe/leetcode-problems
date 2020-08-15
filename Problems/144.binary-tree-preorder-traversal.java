/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> elements = new ArrayList<Integer>();
        Stack<TreeNode> search = new Stack<TreeNode>();
        search.push(root);
        while (!search.isEmpty()) {
            TreeNode node = search.pop();
            if (node != null) {
                elements.add(node.val);
                search.push(node.right);
                search.push(node.left);
            }
        }
        return elements;
    }
}
// @lc code=end

