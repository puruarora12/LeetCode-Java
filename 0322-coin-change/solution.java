class Solution {
    public int coinChange(int[] coins, int amount) {
        int count = 0;
        int[] am = new int[amount+1];
        
        Arrays.fill(am, amount+1);
        am[0]=0;
        for(int i =1; i<=amount; i++){
            for(int c: coins){
                if(i-c>=0)
                    am[i]=Math.min(am[i], am[i-c]+1);
                    // System.out.println("for "+i+" value "+am[i]);
            }
        }
        // System.out.println(am[amount]);
        if(am[amount]>amount) return -1;
        else return am[amount];
    }
}
