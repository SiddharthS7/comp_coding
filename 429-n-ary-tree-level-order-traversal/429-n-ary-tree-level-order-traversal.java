/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) {
            return ans; 
        }
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> li=new ArrayList<>();
            int l=q.size();
            for(int i=0;i<l;i++) {
                Node t=q.poll();
                li.add(t.val);
                for(Node j:t.children) {
                    q.offer(j);
                }
            }
            ans.add(li);
        }
        return ans;
    }
}