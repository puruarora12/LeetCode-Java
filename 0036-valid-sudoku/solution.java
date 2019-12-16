class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        short[] rows = new short[9];
        short[] cols = new short[9];
        short[] squares = new short[9];
     
        for(int row =0 ; row<9 ; row++){
            for(int col = 0 ; col<9 ; col++){
                if(board[row][col]=='.')
                    continue;
                
                short value  = (short) (1<<Integer.parseInt(""+board[row][col])-1);
               
                if((value & rows[row])>0)
                    return false;
                if((value & cols[col])>0)
                    return false;
                if((value & squares[3*(row/3)+(col/3)])>0)
                    return false;
                
                rows[row] |=value;
                cols[col] |=value;
                squares[3*(row/3)+(col/3)] |=value;
            }
        }
        
        return true;
    }
}



