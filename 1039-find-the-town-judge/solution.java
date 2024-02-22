class Solution {
    public int findJudge(int n, int[][] trust) {
        int mat[][] = new int[n][n];
        for(int i[] : trust){
            mat[i[0]-1][i[1]-1]=1;
        }
        
        for(int i=0 ; i<n ; i++){
            int sum = 0;
            for(int j : mat[i] ) sum+=j;
            if(sum==0 && check(i, mat)) return i+1;
        }
        return -1;
    }
    public static boolean check(int j , int[][] mat){
        int sum = 0;
        for(int i = 0 ; i <mat.length ; i++){
            sum+=mat[i][j];
            
        }
        if(sum==mat.length-1) return true;
        return false;
    }
}
