class Solution {
    public boolean exist(char[][] board, String word) {
        int n =board.length;
        int m  = board[0].length;
    
        for(int i = 0 ; i <n  ; i++){
            for(int j = 0 ; j <m ; j++){
                if(board[i][j]==word.charAt(0) && dfs(board, word, i,j , 0))return true;
            }
        }
        return false;
 
    }

     private boolean dfs(char[][] board, String word,int i , int j, int index ){
           
            if(index==word.length())return true;

            if(i<0  || i>=board.length || j<0 || j>=board[0].length || (board[i][j]!=word.charAt(index) ) ) return false;
               char temp = board[i][j];
               board[i][j]='#';
                
            if(dfs(board, word,i , j+1 , index+1 ) ||
            dfs(board, word, i+1 , j , index+1) ||
            dfs(board, word, i , j-1 , index+1) ||
            dfs(board, word, i-1 , j , index+1)
             )return true;
            board[i][j]=temp;
        

            return false;
            

    }
}
