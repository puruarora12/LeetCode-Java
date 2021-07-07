class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r = matrix.length;
        int c = matrix[0].length;
        int index = 0 ; 
        int ar[] = new int[r*c];
        for(int i = 0 ; i <r ; i++){
            for(int j = 0 ; j <c ; j++){
                ar[index]=matrix[i][j];
                index++;
                
            }
        }
        Arrays.sort(ar);
        return ar[k-1];
    }
}
