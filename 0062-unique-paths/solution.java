class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] i:dp) Arrays.fill(i, -1);
        return find(0,0 ,dp , m , n);
        
        }
    private int find(int x,  int y , int[][] dp , int m , int n){
        if(x==m-1 && y==n-1) return 1;
        else if (x>=m || y>=n) return 0;
        else if(dp[x][y]!=-1) return dp[x][y];
        else return dp[x][y]= find(x+1 , y ,dp , m , n)+ find(x , y+1 , dp , m, n);
    }

}
