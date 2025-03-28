class Solution {
    
    public int maxAreaOfIsland(int[][] grid) {
    int max = 0 ;
        for(int i =0 ; i<grid.length; i++)
            for(int j= 0 ; j<grid[i].length ; j++)
                if(grid[i][j]==1)
                    max = Math.max( helper(grid, i, j) ,max);
     return max ;

    }

    private int helper(int[][] grid, int i , int j ){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0) return 0;
        grid[i][j]=0; 
       int area = 1;
        return area +helper(grid, i+1 , j )
        +helper(grid, i-1 , j )
        +helper(grid, i, j+1  )
        +helper(grid, i, j-1 );
        
        

    }
}
