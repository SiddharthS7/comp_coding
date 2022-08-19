//https://practice.geeksforgeeks.org/problems/length-of-largest-region-of-1s-1587115620/1
class Solution
{
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int ans=0;
        boolean[][] v=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j] == 1 && !v[i][j]) {
                    ans = Math.max(ans,dfs(grid,v,i,j));
                }
            }
        }
        return ans;
    }
    int dfs(int[][] grid, boolean[][] v, int i, int j) {
        if(!valid(grid,v,i,j))return 0;
        int ans=1;
        v[i][j]=true;
        ans += dfs(grid,v,i-1,j-1);
        ans += dfs(grid,v,i+1,j);
        ans += dfs(grid,v,i,j+1);
        ans += dfs(grid,v,i-1,j);
        ans += dfs(grid,v,i,j-1);
        ans += dfs(grid,v,i+1,j+1);
        ans += dfs(grid,v,i+1,j-1);
        ans += dfs(grid,v,i-1,j+1);
        return ans;
    }
    boolean valid(int[][] grid, boolean[][] v,int i, int j) {
        if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j] == 0 || v[i][j]) {
            return false;
        }
        return true;
    }
}
