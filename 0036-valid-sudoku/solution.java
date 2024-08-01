class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i<9 ; i++){
            HashSet<Character> setij = new HashSet<>();
            HashSet<Character> setji = new HashSet<>();
            for(int j = 0 ; j<9 ; j++){
                // System.out.println(i +"   "+j);
                if (setij.contains(board[i][j])) return false;
                else if (board[i][j]=='.') ;
                else setij.add(board[i][j]);
                
                if (setji.contains(board[j][i]) )return false;
                else if (board[j][i]=='.') ;
                else setji.add(board[j][i]);
            }
        }
        // int r = 0 ;
        // System.out.println("Till here");
        int c = 0 ;
        int r =0;
        for(int i =0 ; i<3 ; i++){
           // c=0;
            for(int j =0 ; j<3 ; j++){
                 r=i*3;
                 HashSet<Character> set = new HashSet<>();
                for(int x =0 ; x<3 ; x++ ){
                     
                     // System.out.println("j is "+j+" x is "+x+"       "+ r+"  "+c);
                        if (set.contains(board[r][c])) return false;
                        else if (board[r][c]=='.') ;
                        else set.add(board[r][c]);
                    
                    if (set.contains(board[r+1][c]) )return false;
                        else if (board[r+1][c]=='.') ;
                        else set.add(board[r+1][c]);
                    
                    if (set.contains(board[r+2][c])) return false;
                        else if (board[r+2][c]=='.') ;
                        else set.add(board[r+2][c]);
                    // System.out.println("checked "+r+""+c +" "+(r+1)+""+c+" "+(r+2)+""+c);
                    c++;
                   
                
            }
                // System.out.println() ;               
              
        }
           // System.out.println("///////////////////////////////////");                   
c=0;
        }
            return true;
            
    }
}
