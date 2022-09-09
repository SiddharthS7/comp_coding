class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int ans = 0;      
        Arrays.sort(properties,(int[] a,int[] b) -> {
            if(a[0] == b[0]){
                return a[1]-b[1];
            }else{
                return b[0] - a[0];
            }
        });
        System.out.println(Arrays.deepToString(properties));
        int max = properties[0][1];
        for(int i = 1; i < properties.length; i++){
            if(properties[i][1] < max){
                ans++;
            }else{
                max = properties[i][1];
            }
        }
        return ans;
    }
}