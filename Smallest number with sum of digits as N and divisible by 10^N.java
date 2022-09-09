//https://practice.geeksforgeeks.org/problems/smallest-number-with-sum-of-digits-as-n-and-divisible-by-10n4032/1

class Solution
{
    public String digitsNum(int N)
    {
        // Code here
        StringBuilder ans=new StringBuilder();
        if(N<=9) {
            ans.append(N);
        }else{
            int num=0;
            for(int i=9;i>=1;) {
                if(num+i <= N) {
                    num+=i;
                    ans.append(i);
                }else if(num+i > N) {
                    i--;
                }else{
                    break;
                }
            }
            ans.reverse();
        }
        for(int i=0;i<N;i++)ans.append(0);
        return ans.toString();
    }
}
