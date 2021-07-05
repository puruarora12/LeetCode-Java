class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int m = mat.length ; 
        int n = mat[0].length;
        if (m*n!=r*c) return mat;
        if (r==m && c==n) return mat;
        int n_index = 0 ;
        int o_index = 0 ;
        int n_mat[][] = new int[r][c];
        while(n_index<r*c && o_index<m*n){
            n_mat[n_index/c][n_index%c] = mat[o_index/n][o_index%n];
            n_index++;
            o_index++;
        }
        return n_mat;
    }
}
