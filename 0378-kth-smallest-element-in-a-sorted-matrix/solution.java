class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] ar = new int[matrix[0].length*matrix.length];
        int index =0; 
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j <matrix[0].length ; j++){
                ar[index++] = matrix[i][j];            }
        }
        Arrays.sort(ar);
       // for(int i: ar) System.out.print(i+" " );
        return ar[k-1];
    }
}
