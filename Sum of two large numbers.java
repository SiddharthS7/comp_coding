class Solution {
    String findSum(String x, String y) {
        // code here
        java.math.BigInteger a=new java.math.BigInteger(x);
        java.math.BigInteger b=new java.math.BigInteger(y);
        return a.add(b).toString(); 
    }
}
