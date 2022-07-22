class Solution {
    public int maxSubArray(int[] nums) {
       int[] dp = new int[nums.length];
        dp[0]= nums[0];
        for(int i =1  ; i<nums.length ; i++){
            dp[i]= Math.max(nums[i], nums[i]+dp[i-1]);
        }
        int ans = Integer.MIN_VALUE;
        for(int i : dp) ans = Math.max(ans , i);
        return ans;
    }
}
