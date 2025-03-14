class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] found = new boolean[127];
        

        //rows
        for(char i[]:board){
            Arrays.fill(found,false);
            for(char n:i){
                if(n!='.' && found[n]) return false;
                found[n]=true;
            }   
        }

        //cols
        int[][] dirs = new int[][]{{0,0} ,{1,0} , {2,0} , {0,1} ,{1,1} , {2,1} ,{0,2} ,{1,2} , {2,2} };
        for(int i = 0 ; i<board.length ; i++){
            Arrays.fill(found,false);
            for(int j =0 ; j<board.length ; j++){
                if(board[j][i]!='.' && found[board[j][i]] )return false;
                found[board[j][i]]=true;
            }
        }

        //diag
        for(int i =0 ; i<board.length ; i+=3){
            for(int j =0 ; j<board.length; j+=3){
                Arrays.fill(found,false);
                for(int x[] :dirs){
                    if(board[i+x[0]][j+x[1]]!='.' && found[board[i+x[0]][j+x[1]]] )return false;
                    found[board[i+x[0]][j+x[1]]]=true;
                }
            }
        }

        return true;
    }
}
