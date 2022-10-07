//https://practice.geeksforgeeks.org/problems/flatten-binary-tree-to-linked-list/1

class Solution
{
    static Node curr;
    public static void flatten(Node root)
    {
        //code here
        curr=new Node(-1);
        dfs(root);
    }
    static void dfs(Node root) {
        if(root==null)return;
        Node ls=root.left;
        Node rs=root.right;
        root.left=null;
        root.right=null;
        curr.right=root;
        curr=curr.right;
        dfs(ls);
        dfs(rs);
    }
}
