//https://practice.geeksforgeeks.org/problems/ball-coloring3450/1

class Solution {
    static long noOfWays(long n){
        // code here
        long ans = n*(n-1) + 2;
        return ans;
    }
}
