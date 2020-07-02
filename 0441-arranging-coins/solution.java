class Solution {
    public int arrangeCoins(int n) {
        int count =0;
        for(int i =1;i<=n;i++){
            n-=i;
            if (n>=0)
                count++;
            
        }
        return count;
    }
}
