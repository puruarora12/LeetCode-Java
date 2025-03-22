class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m =heights.length;
        int n = heights[0].length;
        boolean[][] pac = new boolean[m][n];
        boolean[][] atl = new boolean[m][n];
        for(int i =0 ; i<m ; i++){
        dfs(heights, pac,Integer.MIN_VALUE, i,0,m,n);
        dfs(heights, atl,Integer.MIN_VALUE, i,n-1,m,n);
        }
        for(int i = 0 ;i<n; i++){
        dfs(heights, pac,Integer.MIN_VALUE, 0,i,m,n);
        dfs(heights, atl,Integer.MIN_VALUE, m-1,i,m,n);
        }
        List<List<Integer>> ans= new ArrayList<>();
        for(int i =0 ; i<m;i++){
            for(int j = 0 ; j<n ; j++){
                // System.out.print( ",  [p "+pac[i][j]+"  a "+atl[i][j]+"]");
                if(pac[i][j] && atl[i][j] ) ans.add(List.of(i,j));
            }
            // System.out.println();
        }
        return ans;
    }
    int[][] dir = new int[][]{{1,0} , {0,1} , {-1,0}, {0,-1}};
    private void dfs(int[][] heights, boolean[][] ocean, int value, int i , int j, int m, int n ){
        if(i<0 || i>=m || j<0 || j>=n || ocean[i][j] || heights[i][j]<value ) return;
        //if(heights[i][j]>=value){
            ocean[i][j]=true;
            for(int[] index :dir)
            dfs(heights, ocean,heights[i][j] ,i+index[0] , j+index[1],m,n );
      //  }

    }
}
