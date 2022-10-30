class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length ;
        int[] temp = new int[n];
        
        for(int i = 0 ; i<n/2 ; i++){
            temp = matrix[i];
            matrix[i]=matrix[n-1-i];
            matrix[n-i-1]=temp;
        }
             
        for(int i = 0 ; i<n ; i++){
            for(int j =i ; j<n ; j++){
                if(i==j) continue;
                int t = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
    }
}