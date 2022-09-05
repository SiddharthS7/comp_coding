https://practice.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray/1
#Kdane Sum Inverse
class Solution
{
    static int smallestSumSubarray(int a[], int size)
    {
        // your code here
        int ans=Integer.MAX_VALUE;
        int cur=0;
        for(int i=0;i<size;i++) {
            cur+=a[i];
            ans=Math.min(ans,cur);
            if(cur>0)cur=0;
        }
        return ans;
    }
}
