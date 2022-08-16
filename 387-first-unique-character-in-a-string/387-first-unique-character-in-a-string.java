class Solution {
    public int firstUniqChar(String s) {
        int ans=s.length();
        for(char i='a';i<='z';i++) {
            int first=s.indexOf(i);
            if(first != -1 && s.lastIndexOf(i)==first) {
                ans = Math.min(ans,first);
            }
        }
        return ans==s.length()?-1:ans;
    }
}