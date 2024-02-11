class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[] maxs = new int[matrix[0].length];
        for(int i = 0 ; i <matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++)
                maxs[j] = Math.max(maxs[j], matrix[i][j]);
        }
         for(int i = 0 ; i <matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++)
                if(matrix[i][j]==-1)matrix[i][j]=maxs[j];
        }
        return matrix;
    }
}
