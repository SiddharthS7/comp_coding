//https://practice.geeksforgeeks.org/problems/find-all-distinct-subset-or-subsequence-sums4424/1

class Solution
{
    public int[] DistinctSum(int[] nums)
    {
        // Code here
        boolean[][] t=new boolean[101][10001];
        Set<Integer> set=new HashSet<>();
        dfs(nums,0,0,set,t);
        int[] ans=new int[set.size()];
        int k=0;
        for(int i:set) {
            ans[k++]=i;
        }
        Arrays.sort(ans);
        return ans;
    }
    public void dfs(int[] nums, int i, int sum, Set<Integer> set, boolean[][] t) {
        if(i==nums.length) {
            set.add(sum);
            return;
        }
        if(t[i][sum])return;
        t[i][sum]=true;
        dfs(nums,i+1,sum,set,t);
        dfs(nums,i+1,sum+nums[i],set,t);
    }
}
