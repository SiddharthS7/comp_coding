//https://practice.geeksforgeeks.org/problems/fact-digit-sum4125/1

class Solution
{
    ArrayList<Integer> FactDigit(int N)
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int[] f=new int[10];
        f[0]=1;
        for(int i=1;i<10;i++) {
            f[i]=f[i-1]*i;
        }
        for(int i=9;i>=1;i--) {
            while(N>=f[i]) {
                N-=f[i];
                ans.add(i);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
