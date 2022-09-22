class Solution {
    public int maxProfit(int[] prices) {
        int[] ans = new int[prices.length];
        int min = prices[0];
        int max = 0;
        for(int i =0 ; i<prices.length ; i++){
            ans[i] = prices[i]-min;
            max = Math.max(ans[i], max);
            if(min>prices[i]) min=prices[i];
        }
    //for(int i :ans) System.out.print(i+"  ");
        return max;
    }
}
