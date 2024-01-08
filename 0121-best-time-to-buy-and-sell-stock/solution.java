class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; 
        int left = Integer.MAX_VALUE;
        
        for(int price:prices){
            if(price<left) left =price;
            else if(price - left>profit) profit = price-left;
        }
        return profit;
    }
}
