class Solution {
    public void solve(char[][] board) {
        int m = board.length; 
        int n = board[0].length;
        // System.out.println(m+"   "+n);
        List<String> filled = new ArrayList<>();
        for(int i = 0 ; i<m; i++){
            if(board[i][0]=='O') helper(board, i, 0 );
            if(board[i][n-1]=='O') helper(board, i , n-1 );
        }
        for(int j = 0 ; j<n; j++){
            if(board[0][j]=='O') helper(board, 0, j );
            if(board[m-1][j]=='O') helper(board,m-1 , j );
        }

        for(int i = 0 ; i <m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(board[i][j]=='O' ) board[i][j]='X';
                if(board[i][j]=='T') board[i][j]='O';
            }
        }
    }

    public static void helper(char[][] board, int i , int j ){
        // System.out.println("starting "+i+ "    "+j);
        if(i<0 || i>board.length-1 || j<0 || j>board[0].length-1 ) return;
        if(board[i][j]=='O'){

        board[i][j]='T';
        // filled.add(i+","+j);
        // System.out.println("filled for "+i+"   "+j);
        helper(board, i+1, j );
        helper(board, i-1, j );
        helper(board , i , j+1 );
        helper(board, i , j-1 );
        }
        return;
    }
}
