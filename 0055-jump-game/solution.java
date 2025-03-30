class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[n-1]=true;
        int last = n-1;
        for(int i =n-2 ; i>=0; i--){
            if(i+nums[i]>=nums.length || i+nums[i]>=last ){ 
                dp[i]=true; 
                last = i;
            }
            else dp[i]=false; 
        }
        return dp[0];
    }
}
