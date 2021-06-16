class Solution {
    public int maxProfit(int[] prices) {
       int sum = 0 ; 
        for (int i = 0 ; i<prices.length-1 ; i++){
           if (prices[i+1]-prices[i]>0){
               sum+=(prices[i+1]-prices[i]);//-prices[i];
               //System.out.println(prices[i]+"  "+prices[i+1]);
               
           }
       }
        return sum;
    }
}
