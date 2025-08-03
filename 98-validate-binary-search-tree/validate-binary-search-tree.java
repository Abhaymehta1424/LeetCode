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
    TreeNode prev = null;
    public boolean inOrder(TreeNode node){
        if (node == null) return true;

        // Traverse left subtree
        if (!inOrder(node.left)) return false;

        // Check current node value
        if (prev != null && node.val <= prev.val) return false;
        prev = node;

        // Traverse right subtree
        return inOrder(node.right);

    }
    public boolean isValidBST(TreeNode root) {
        return inOrder(root);
    }
}