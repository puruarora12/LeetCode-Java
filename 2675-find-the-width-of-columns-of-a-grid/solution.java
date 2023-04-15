class Solution {
    public int[] findColumnWidth(int[][] grid) {
      //int[][] changed = new int[][];
        //for(int i = 0 ; i<grid ; i++){
            
        //}
        
      int[] lenarr = new int[grid[0].length];
        int index = 0;
        //int row = 0 ;
        //int column = 0 ;
        for(int column = 0 ; column<grid[0].length ; column++){
            int temp = 0 ;
            for(int row =0 ; row<grid.length; row++){
                int len = (""+grid[row][column]).length();
                temp = Math.max(temp, len);
            }
            lenarr[index]= temp;
            index++;
        }
        return lenarr;
    }
}
