class Solution {
    public int coinChange(int[] coins, int amount) {
        int count = 0;
        int[] am = new int[amount+1];
        
        Arrays.fill(am, amount+1);
        am[0]=0;
        for(int c: coins){
        for(int i =c; i<=amount; i++){
                // if(i-c>=0)
                    am[i]=Math.min(am[i], am[i-c]+1);
                    
            }
        }
        if(am[amount]>amount) return -1;
        else return am[amount];
    }
}
