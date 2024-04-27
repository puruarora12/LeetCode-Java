class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        int rows[] = new int[grid.length];
        int cols[]= new int[grid[0].length];
        Arrays.fill(rows,0);
        Arrays.fill(cols,0);
        
        for(int i = 0 ; i<grid.length ; i++){
            for(int j =0 ; j<grid[0].length ; j++){
                if(grid[i][j]==1) {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }
        long ans = 0;
        // for (int i: rows) System.out.print(i+" ");
        // System.out.println();
        // for (int i: cols) System.out.print(i+" ");
        // System.out.println();
         for(int i = 0 ; i<grid.length ; i++){
            for(int j =0 ; j<grid[0].length ; j++){
                if(grid[i][j]==1){
                    if(rows[i]>1 && cols[j]>1) { ans+=(rows[i]-1)*(cols[j]-1); }
                }
            }
             
         }
        return ans;
        
        
    }
}
