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
    List<Integer> l=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root,l);
        return l;
    }
    public void dfs(TreeNode root,List<Integer> l) {
        if(root==null)return;
        dfs(root.left,l);
        l.add(root.val);
        dfs(root.right,l);
    }
}