class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        def dfs(i, j, grid):
            if i<0 or i>len(grid)-1 or j<0 or j>len(grid[0])-1 or grid[i][j]==0:
                return 0
            else:
                grid[i][j]=0
                return 1+ dfs(i+1,j, grid)+ dfs(i-1,j,grid)+dfs(i,j+1,grid)+dfs(i,j-1,grid)


        area = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j]==1:
                    area = max(dfs(i,j,grid),area)
        
        return area

        
