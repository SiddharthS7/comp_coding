//https://practice.geeksforgeeks.org/problems/next-right-node/1

class Solution{
	Node nextRight(Node root, int key)
    {
		//Write your code here
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		boolean flag=false;
		while(!q.isEmpty()) {
		    int l=q.size();
		    while(l-- > 0) {
		        Node t=q.remove();
		        if(flag)return t;
		        if(t.data==key)flag=true;
		        if(t.left != null)q.add(t.left);
		        if(t.right != null)q.add(t.right);
		    }
		    if(flag)return new Node(-1);
		}
		return null;
    }
}
