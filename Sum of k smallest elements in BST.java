//https://practice.geeksforgeeks.org/problems/sum-of-k-smallest-elements-in-bst3029/1

class Tree {
    List<Integer> l=new ArrayList<>();
    int sum(Node root, int k) { 
        
        // Code here
        
        Node t=root;
        dfs(root,l);
        Collections.sort(l);
        int s=0;
        for(int i=0;i<k;i++)s+=l.get(i);
        return s;
    } 
    void dfs(Node root,List<Integer> l) {
        if(root==null) {
            return;
        }
        dfs(root.left,l);
        l.add(root.data);
        dfs(root.right,l);
    }
}
