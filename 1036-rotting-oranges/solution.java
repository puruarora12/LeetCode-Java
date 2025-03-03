class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j]==2)q.add(new int[]{i,j});
                else if(grid[i][j]==1)fresh++;
            }
        }
        if(fresh==0) return 0;
        int[][] dirs= {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int qsize = q.size();
            count++;
            for(int i=0 ; i<qsize; i++){
                int[] pos = q.poll();
                
                for(int[] dir:dirs){
                    
                    int x = pos[0]+dir[0];
                    int y =pos[1]+dir[1]; 
                    if(x<0  || x>=m || y<0 || y>=n || grid[x][y]==0 || grid[x][y]==2  )continue;
                    else{
                        q.add(new int[]{x,y});
                        grid[x][y]=2;
                        fresh--;
                    }
                }

            }
          
        }
        return fresh==0? count-1:-1;
    }
}
