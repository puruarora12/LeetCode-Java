class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
       int i =0 ; 
       int j = 0 ;
       int m = mat.length;
       int n = mat[0].length;
       boolean col =false;
       int[] ans = new int[m*n];
       int count = 0 ; 
    //    System.out.println(mat[0][1]);
       traverse(mat, i, j, m,n,col,ans, count );
       return ans;

    }
    public static void traverse(int[][] mat, int i, int j , int m , int n , boolean col, int[] ans, int count){
        // System.out.println(i+"  "+j);
        if(i>=0 && j>=0 && i<m && j <n){
            ans[count]=mat[i][j];
            count++;
            if (col){
                traverse(mat, i+1 , j-1 , m , n, col, ans, count);
            }else{
                traverse(mat, i-1, j+1 , m , n , col,ans,count);
            }
        }else{
            if (count>=m*n) return;
            if(i<0 && j<n) traverse(mat, i+1, j , m , n , !col,ans,count);
            else if(j<0 && i<m) traverse(mat, i, j+1 , m , n , !col,ans,count);
            else if (j>=n) traverse(mat, i+2, j-1 , m , n , !col,ans,count);
            else traverse(mat, i-1, j+2 , m , n , !col,ans,count);
            
        }

        
    }
}
