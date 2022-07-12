class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int res = 0 ;
        for(int i =0 ; i<prices.length ; i++){
            if (prices[i]>max) max = prices[i];
            if(prices[i]<min){
                min = prices[i];
                max =0 ;
            }
            res = Math.max(max - min, res);
                
        }
        
        return res;
            
    }
}
