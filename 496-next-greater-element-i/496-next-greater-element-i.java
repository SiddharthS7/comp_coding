class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums2.length;i++) {
            for(int j=i+1;j<nums2.length;j++) {
                if(nums2[j] > nums2[i]) {
                    hm.put(nums2[i],nums2[j]);
                    break;
                }else{
                    hm.put(nums2[i],-1);
                }
            }
        }
        hm.put(nums2[nums2.length-1],-1);
        System.out.println(hm);
        for(int i=0;i<nums1.length;i++) {
            ans[i] = hm.get(nums1[i]);
        }
        return ans;
    }
}