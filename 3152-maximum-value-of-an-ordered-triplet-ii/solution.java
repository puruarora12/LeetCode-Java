class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        int[] maxs = new int[nums.length];
        maxs[nums.length-1]=nums[nums.length-1];

        for(int i = nums.length-2 ; i>=0 ; i--)
           maxs[i]  = Math.max(maxs[i+1], nums[i]);
        long large = nums[0];
        for(int i =0 ; i<nums.length-1 ;i++){
            ans = Math.max(ans, (large - nums[i])* maxs[i+1] );
            large = Math.max(nums[i], large);

        }
        return ans;
    }
}
