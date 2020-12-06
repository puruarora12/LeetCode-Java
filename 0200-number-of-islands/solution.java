class Solution {
    public int numIslands(char[][] grid) {
    int count = 0;
        for(int row =0 ; row<grid.length; row++){
            for (int col = 0 ; col<grid[row].length ;col++){
                if(grid[row][col]=='1'){
                   grid= calc1(row,col, grid);
                    
                  //  for (char[] a : grid ){
                       // for(char b : a)
                      //      System.out.print(b+" ");
                        
                    // System.out.println();
                        
                  //  }
                    count++;  
                    
                } 
                //System.out.println(grid[row][col]);
                
                }
        }    
        
     return count;
    }

    
    

    public static char[][] calc1(int r , int c, char[][] grid ){
    grid[r][c]='0';
        if( (r+1)<grid.length && grid[r+1][c]=='1')
            grid =calc1(r+1 , c , grid);
            
        if( (r-1)>=0 && grid[r-1][c]=='1')
            grid =calc1(r-1 , c , grid);
            
        if( (c+1)<grid[r].length && grid[r][c+1]=='1')
            grid =calc1(r , c+1 , grid);
            
        if( (c-1)>=0 && grid[r][c-1]=='1')
            grid =calc1(r , c-1 , grid);
    
      return grid;      
            }
    
    
}




