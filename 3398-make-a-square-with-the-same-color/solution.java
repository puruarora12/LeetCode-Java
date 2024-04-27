class Solution {
    public boolean canMakeSquare(char[][] grid) {
        if(score(grid , 0 ,0  )<=1 || score(grid,0,0)>=3 || score(grid , 0 ,1  )<=1 || score(grid,0,1)>=3 || score(grid , 1 ,0  )<=1 || score(grid,1,0)>=3 || score(grid , 1,1)<=1 || score(grid,1,1)>=3) return true; 
        else return false;
        
    }
    public int score(char[][] grid, int left, int depth){
        if(left>=0 && left+1<3 && depth+1<3  ); else return 0;
        //if(left+1>=0 && bright<3 && bleft<bright)continue; else return 0;
        int score = 0;
        if(grid[left][depth]=='B')score++;
        //if(grid[left][depth]='W')score--;
        
        if(grid[left+1][depth]=='B')score++;
        //if(grid[left+1][depth]='W')score--;
        
        if(grid[left][depth+1]=='B')score++;
        //if(grid[left][depth+1]='W')score--;
        
        if(grid[left+1][depth+1]=='B')score++;
        //if(grid[left+1][depth+1]='W')score--;
        return score;
    }
}
