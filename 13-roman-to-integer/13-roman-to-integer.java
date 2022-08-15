class Solution {
    public int romanToInt(String s) {
        int i = 0, result = 0, n = s.length();
        int ar[] = new int[n];
        for(i=0;i<n;i++){
            switch(s.charAt(i)){
                case 'I':
                    ar[i] = 1;
                    break;
                case 'V':
                    ar[i] = 5;
                    break;
                case 'X':
                    ar[i] = 10;
                    break;
                case 'L':
                    ar[i] = 50;
                    break;
                case 'C':
                    ar[i] = 100;
                    break;
                case 'D':
                    ar[i] = 500;
                    break;
                case 'M':
                    ar[i] = 1000;
                    break;
            }
        }
        i = 0;
        while(i<n-1){
            if(ar[i]<ar[i+1])
                result = result - ar[i];
            else
                result = result + ar[i];
            i++;
        }
        result = result + ar[i];
        return result;
    }
}