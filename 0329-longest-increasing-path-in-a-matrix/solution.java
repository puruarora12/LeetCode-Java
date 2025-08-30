class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int path = 0 ;
        int m = matrix.length , n = matrix[0].length;
        int mem[][] = new int[m][n];

        for(int i = 0 ; i <m ; i++){
            for(int j = 0; j<n ; j++){
                path = Math.max(path, helper(matrix, m,n,i,j,mem));
            }
        }
        return path;
        
        }
    public int dir[][] = {{1,0}, {-1,0}, {0,1} , {0,-1}};
    public  int helper(int[][] matrix, int m , int n  , int i , int j , int[][] mem){
        int path =0;
        if(mem[i][j]>0) return mem[i][j];
        for(int[] d : dir){
            int x = i+d[0];
            int y = j+d[1];
            if(x>=0 && y>=0 && x<m && y<n && matrix[x][y]>matrix[i][j])
                path = Math.max(path, helper(matrix, m , n , x, y,mem));
        }
        mem[i][j]=path+1;
        return path+1;
    }
}
