//https://practice.geeksforgeeks.org/problems/max-length-chain/1

class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       Arrays.sort(arr, (a,b) -> a.y - b.y);
       int c=1;
       Pair prev=arr[0];
       for(int i=1;i<n;i++) {
           if(arr[i].x > prev.y) {
               c++;
               prev = arr[i];
           }
       }
       return c;
    }
}
