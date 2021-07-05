class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m  = mat.length;
        int n = mat[0].length ;
        if(r==m && n==c) return mat;
        int nmat[][] = new int[r][c];
        int oindex =0 ;
        int nindex =0;
        if(r*c !=m*n ) return mat;
        while(oindex <m*n  && nindex<r*c){
            nmat[nindex/c][(nindex%c)] = mat[oindex/n][oindex%n];
            oindex++;
            nindex++;
        }
        return nmat;
    }
}
