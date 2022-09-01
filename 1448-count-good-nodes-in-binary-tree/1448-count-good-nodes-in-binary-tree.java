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
    int ans = 0;
    public int goodNodes(TreeNode root) {
        dfs(root,root.val);
        return ans;
    }
    public void dfs(TreeNode root, int val) {
        if(root==null)return;
        if(val<=root.val)ans++;
        dfs(root.left,Math.max(root.val,val));
        dfs(root.right,Math.max(root.val,val));
    }
}