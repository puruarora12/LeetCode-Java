class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 4/7 inspection
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
      
        int c = 0 ;
        int r =0;
        for(int i =0 ; i<3 ; i++){
           
            for(int j =0 ; j<3 ; j++){
                 r=i*3;
                 HashSet<Character> set = new HashSet<>();
                for(int x =0 ; x<3 ; x++ ){
                     
                   
                        if (set.contains(board[r][c])) return false;
                        else if (board[r][c]=='.') ;
                        else set.add(board[r][c]);
                    
                    if (set.contains(board[r+1][c]) )return false;
                        else if (board[r+1][c]=='.') ;
                        else set.add(board[r+1][c]);
                    
                    if (set.contains(board[r+2][c])) return false;
                        else if (board[r+2][c]=='.') ;
                        else set.add(board[r+2][c]);
                    c++;
                   
                
            }
                  
                           
              
        }
                        
c=0;
        }
            return true;
            
    }
}
