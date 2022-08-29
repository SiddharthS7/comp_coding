class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j]=='1') {
                    ans++;
                    helper(i,j,grid);
                }
            }
        }
        return ans;
    }
    public void helper(int i, int j, char[][] grid) {
        grid[i][j]='*';
        if(i-1>=0 && grid[i-1][j]=='1') {
            helper(i-1,j,grid);
        }
        if(i+1<=grid.length-1 && grid[i+1][j]=='1') {
            helper(i+1,j,grid);
        }
        if(j-1>=0 && grid[i][j-1]=='1') {
            helper(i,j-1,grid);
        }
        if(j+1<=grid[i].length-1 && grid[i][j+1]=='1') {
            helper(i,j+1,grid);
        }
    }
}