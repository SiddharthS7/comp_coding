class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] index = Arrays.copyOf(nums, nums.length);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            index[nums[i]-1]=0;
        }    
        for(int i=0;i<nums.length;i++) {
            if(index[i]!=0) {
                ans.add(i+1);
            }
        }
        return ans;
    }
}