//https://practice.geeksforgeeks.org/problems/stack-permutations/1

class Solution {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        Stack<Integer> s=new Stack<>();
        int k=0;
        for(int i=0;i<ip.length;i++) {
            s.push(ip[i]);
            while(!s.isEmpty() && s.peek()==op[k]) {
                s.pop();
                k++;
            }
        }
        if(s.isEmpty())return 1;
        return 0;
    }
}
