class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rowsize = 9 , colsize = 9 ;
        
        //HashMap<Character , Integer> rmap = new HashMap<>();
        System.out.println("In row Check");
        for(int row = 0 ; row <rowsize ;row++){
            HashMap<Character , Integer> map = new HashMap<>();
            for(int col = 0 ; col<colsize ; col++){
                if(board[row][col]!='.')
                    if(!map.containsKey(board[row][col]))
                    map.put(board[row][col] , 1);
                    else
                        return false;
            }
        }
        System.out.println("Out row Check");
        System.out.println("In col Check");
        for(int col = 0 ; col <colsize ;col++){
            HashMap<Character , Integer> map = new HashMap<>();
            for(int row = 0 ; row<rowsize ; row++){
                if(board[row][col]!='.')
                    if(!map.containsKey(board[row][col]))
                    map.put(board[row][col] , 1);
                    else
                        return false;
            }
        }
        System.out.println("Out col Check");
        System.out.println("In square Check");
        
        
        int row = 0;
        int col = 0;
        for(int k =1 ; k<=9 ; k++ ){
             HashMap<Character , Integer> map = new HashMap<>();
         for(int i=0; i<3 ; i++){
             for(int j = 0 ; j<3 ;j++){
                if(board[row+i][col+j]!='.')
                    if(!map.containsKey(board[row+i][col+j]))
                    map.put(board[row+i][col+j] , 1);
                    else
                        return false;
             }
         }
            col+=3;
            if(col==9){
                row+=3;
                col=0;
            }
        }
        System.out.println("Out square Check");
        
        
        return true;
    }
}
