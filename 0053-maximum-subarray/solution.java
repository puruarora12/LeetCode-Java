class Solution {
    public int maxSubArray(int[] nums) {
       int[] dp = new int[nums.length];
       int ans = nums[0];
        dp[0]= nums[0];
        for(int i =1  ; i<nums.length ; i++){
            dp[i]= Math.max(nums[i], nums[i]+dp[i-1]);
            ans = Math.max(ans , dp[i]);
        }
        return ans;
    }
}
