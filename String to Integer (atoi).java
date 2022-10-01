class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int i=0;
        while(i<n && Character.isSpaceChar(s.charAt(i)))
            i++;
        if(i==n)
            return 0;
        boolean sign=false;
        switch(s.charAt(i)){
            case '+':
                i++;
                break;
            case '-':
                i++;
                sign=true;
                break;
        }
        long ans=0l;
        while(i<n && Character.isDigit(s.charAt(i))){
            ans=ans*10+Character.getNumericValue(s.charAt(i++));
            if(ans>Integer.MAX_VALUE)
                return sign?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
        return (int)(sign?-ans:ans);
    }
}
