class Solution {
    int max ;
    public int maxAreaOfIsland(int[][] grid) {
     max = 0 ;
        for(int i =0 ; i<grid.length; i++)
            for(int j= 0 ; j<grid[i].length ; j++)
                if(grid[i][j]==1)
                    max = Math.max( helper(grid, i, j, 0) ,max);
     return max ;

    }

    private int helper(int[][] grid, int i , int j , int len){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0) return 0;
        grid[i][j]=0; len++; 
       int area = 1;
        return area +helper(grid, i+1 , j , len)
        +helper(grid, i-1 , j , len)
        +helper(grid, i, j+1  , len)
        +helper(grid, i, j-1  , len);
        
        

    }
}
