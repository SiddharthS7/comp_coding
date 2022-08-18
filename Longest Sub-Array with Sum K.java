//https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int s=0,ans=0;
        for(int i=0;i<N;i++) {
            s+=A[i];
            if(!hm.containsKey(s)) {
                hm.put(s,i);
            }
            if(hm.containsKey(s-K)) {
                ans=Math.max(ans,i-hm.get(s-K));
            }
        }
        return ans;
    }
    
    
}
