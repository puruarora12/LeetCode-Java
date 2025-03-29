class Solution {
    public boolean exist(char[][] board, String word) {
        Queue<int[]> q = new LinkedList<>();
        int n =board.length;
        int m  = board[0].length;
    
        for(int i = 0 ; i <n  ; i++){
            for(int j = 0 ; j <m ; j++){
                if(board[i][j]==word.charAt(0))q.offer(new int[]{i,j});
            }
        }
        while(!q.isEmpty()){
            if(dfs(board, word, q.peek()[0],q.peek()[1] , 0, n,m, new boolean[n][m])) return true;
            q.poll();
        }
        return false;

    }

     private boolean dfs(char[][] board, String word,int i , int j, int index , int n , int m, boolean[][] newvisited){
           if(index==word.length())return true;


            // if(visited.contains(new int[]{i,j}))return false;
            
            if(i<0  || i>=n || j<0 || j>=m || index==word.length() || newvisited[i][j] || ( board[i][j]!=word.charAt(index) ) ) return false;
            //  System.out.println(index+"  char at "+word.charAt(index) +"  curr char "+board[i][j]+"   i j "+i+" "+j);
            
            
            
            // for(int x =0 ; x<n; x++) newvisited[x]=Arrays.copyOf(visited[x], m);
                newvisited[i][j]=true;
                
            if(dfs(board, word,i , j+1 , index+1, n,m , newvisited) ||
            dfs(board, word, i+1 , j , index+1, n,m, newvisited) ||
            dfs(board, word, i , j-1 , index+1, n,m, newvisited) ||
            dfs(board, word, i-1 , j , index+1, n,m, newvisited)
             )return true;
            newvisited[i][j]=false;
            

            return false;
            

    }
}
