class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i = 1 ; i<nums.length  ; i++ ){
            for(int j = 0 ; j <i  ; j++){
                if (nums[i]>nums[j]  && dp[i]<=dp[j]) dp[i]=dp[j]+1;
            }
        }
       // for(int e:dp)
       // System.out.println(e);
        Arrays.sort(dp);
        return dp[nums.length-1];
    }
}
