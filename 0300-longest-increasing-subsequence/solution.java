class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        
        for(int i = 1 ; i<nums.length ; i++){
            for(int j = 0 ; j<i ; j++){
                if(nums[i]>nums[j] && dp[i]<=dp[j]) dp[i]=dp[j]+1;
            }
        }
        Arrays.sort(dp);
        return (dp[nums.length-1]+1);
    }
}
