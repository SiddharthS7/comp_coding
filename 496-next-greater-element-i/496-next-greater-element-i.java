class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums2.length;i++)hm.put(nums2[i],i);
        for(int i=0;i<nums1.length;i++) {
            int k=hm.get(nums1[i]);
            for(int j=k+1;j<nums2.length;j++) {
                if(nums2[j] > nums1[i]) {
                    ans[i]=nums2[j];
                    break;
                }
            }
            if(ans[i]==0)ans[i]=-1;
        }
        return ans;
    }
}