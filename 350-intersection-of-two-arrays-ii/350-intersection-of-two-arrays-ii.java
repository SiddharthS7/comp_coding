class Solution {
    public int[] intersect(int[] n1, int[] n2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i:n1) {
            hm.putIfAbsent(i,0);
            hm.put(i,hm.get(i)+1);
        }
        for(int i:n2) {
            if(hm.containsKey(i) && hm.get(i)>0) {
                ar.add(i);
                hm.put(i,hm.get(i)-1);
            }
        }
        int[] ans=new int[ar.size()];
        for(int i=0;i<ar.size();i++) {
            ans[i]=ar.get(i);
        }
        return ans;
    }
}