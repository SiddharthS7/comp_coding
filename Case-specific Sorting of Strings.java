//https://practice.geeksforgeeks.org/problems/case-specific-sorting-of-strings4845/1
public static String caseSort(String str)
    {
        // Your code here
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        int l=-1;
        int u=-1;
        if(ch[0]<97) {
            u=0;
        }
        for(int i=0;i<ch.length;i++) {
            if(ch[i]>=97) {
                l=i;
                break;
            }
        }
        if(l==-1 || u==-1) {
            return new String(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)<97) {
                sb.append(ch[u++]);
            }else{
                sb.append(ch[l++]);
            }
        }
        return sb.toString();
    }
