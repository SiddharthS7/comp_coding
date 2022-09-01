//https://practice.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        Node t=head;
        Node tail=null;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        while(t!=null) {
            tail=t;
            t=t.next;
        }
        while(head!=tail) {
            if(head.data+tail.data == target) {
                ArrayList<Integer> p=new ArrayList<>();
                p.add(head.data);
                p.add(tail.data);
                ans.add(p);
                tail=tail.prev;
            }else if(head.data+tail.data < target) {
                head=head.next;
            }else{
                tail=tail.prev;
            }
        }
        return ans;
    }
}
