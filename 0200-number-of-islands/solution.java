class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for(int row = 0 ; row<grid.length ; row++){
            for(int col = 0 ; col<grid[0].length ; col++){
                if(grid[row][col]=='1'){
                    find(grid, row, col );
                    islands++;
                }
            }
        }
        return islands;
    }
        public static char[][] find(char[][] grid , int r, int c){
            grid[r][c]=0;
            if(r+1<grid.length && grid[r+1][c]=='1')find(grid, r+1,c);
            if(c+1<grid[0].length && grid[r][c+1]=='1')find(grid, r,c+1);
            if(r-1>=0 && grid[r-1][c]=='1')find(grid, r-1,c);
            if(c-1>=0 && grid[r][c-1]=='1')find(grid, r,c-1);
            return grid;
        } 
        }

    

