class Solution {
    public static boolean edge= false;
    public void solve(char[][] board) {
        for (int i= 0 ; i<board.length ; i++){
            for(int j= 0 ; j<board[0].length ; j++){
                if(board[i][j]=='O'){
                    Set<String> region = new HashSet<>();
                    edge= true;
                    helper(board, i , j, region);
                    if( edge) for (String x: region) board[Integer.parseInt(x.split(",")[0])][Integer.parseInt(x.split(",")[1])]='X';
                    System.out.println(region);
                }
            }
        }
    }

   public static int[][] dirs = new int[][]{{1,0} ,{-1,0}, {0,1}, {0,-1}}; 
   public static void helper(char board[][],  int i , int j , Set<String> region){
        System.out.println(i+"       "+j);
        if(i==0 || i==board.length-1 || j==0 || j==board[i].length-1) {edge= false;return ;}
        region.add(i+","+j);
        System.out.println("region added");
        // region.add(new int[]{100,100});
        // System.out.println(region.contains(new int[]{100,100}));
        for( int[] dir : dirs){
            if(board[i+dir[0]][j+dir[1]]=='O' && !region.contains((i+dir[0])+","+(j+dir[1])) ) helper(board, i+dir[0], j+dir[1], region);

    
        }
        System.out.println("returning true");
        return ;
        
   } 
}
