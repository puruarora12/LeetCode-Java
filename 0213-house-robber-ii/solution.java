class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
      return Math.max(helper(nums, 0, nums.length-1) , helper(nums, 1, nums.length));
    }

    public static int helper(int[] nums, int start, int end ){
          int dp[] = new int[end-start+1+1];
        dp[0]=0;
        for(int i = start ; i<end ; i++){
            if(i==start) dp[i+1]=nums[i];
            else dp[i+1] = Math.max(dp[i-1] +nums[i], dp[i]);
        }
        // for(int i: dp)System.out.println(i);
        // System.out.println("start " +start);
        return start==0 ? dp[dp.length-2] :dp[dp.length-1];
    }
}
