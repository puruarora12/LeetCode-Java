class Solution {
    boolean[][] dp ;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dp = new boolean[image.length][image[0].length];
        for(boolean[] i:dp) Arrays.fill(i , true);
        fill(image, sr ,sc, color, image[sr][sc]);
        return image;
    }
    private void fill(int[][] image, int sr, int sc, int color, int value){
        image[sr][sc]=color;
        dp[sr][sc]=false;
        if(sr-1>=0 && image[sr-1][sc]==value && dp[sr-1][sc]) fill(image , sr-1 , sc , color ,value);
        if(sr+1<image.length && image[sr+1][sc]==value && dp[sr+1][sc]) fill(image , sr+1 , sc , color ,value);
        if(sc-1>=0 && image[sr][sc-1]==value && dp[sr][sc-1]) fill(image , sr, sc-1 , color ,value);
        if(sc+1<image[0].length && image[sr][sc+1]==value && dp[sr][sc+1]) fill(image , sr , sc+1 , color ,value);;
        
    }
}
