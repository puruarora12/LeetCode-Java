class Solution {
    public int minFallingPathSum(int[][] matrix) {
        for(int i =1 ;i<matrix.length ;i++){
            for(int j =0 ; j<matrix.length;j++){
                // System.out.println(" d "+(j+1)+" ma "+(matrix.length-1));
                // System.out.println("left d "+Math.max(0,j-1));
                // System.out.println("right d "+Math.min(matrix.length-1,j+1));
                matrix[i][j]+=Math.min(matrix[i-1][j], Math.min(matrix[i-1][Math.max(0,j-1)], matrix[i-1][Math.min(j+1, matrix.length-1)] ) );
            }
        }
        int[] lr = matrix[matrix.length-1];
        Arrays.sort(lr);
        return lr[0];
    }
}
