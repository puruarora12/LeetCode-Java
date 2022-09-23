class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i = 0 ; i<obstacleGrid.length  ; i++){
            for(int j = 0 ; j<obstacleGrid[0].length ; j++){
                if(obstacleGrid[i][j]==1) dp[i][j]=-2;
                else dp[i][j]=-1;
            }
        }
        
        return check(0 , 0 , obstacleGrid.length , obstacleGrid[0].length  , dp);
    }
    
    private int check(int i ,  int j , int m, int n , int[][] dp){
        if(i==m-1 && j==n-1 && dp[i][j]!=-2) return 1;
        else if(i>=m || j>=n || dp[i][j]==-2) return 0 ;
        else if (dp[i][j]!=-1) return dp[i][j];
        else return dp[i][j] = check(i+1 , j , m , n , dp) + check(i , j+1 , m , n ,dp);
    }
}
