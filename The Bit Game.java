//https://practice.geeksforgeeks.org/problems/the-bit-game2313/1

class Solution {
    public static int swapBitGame(long N) {
        // code here
        String s=Long.toBinaryString(N);
        int co=0;
        for(char c:s.toCharArray()) {
            if(c=='1') {
                co++;
            }
        }
        if(co%2==0){
            return 2;
        }else{
            return 1;
        }
    }
}
