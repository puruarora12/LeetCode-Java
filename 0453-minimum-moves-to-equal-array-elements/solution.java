class Solution {
    public int minMoves(int[] nums) {
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<nums.length ; i++){
            max = Math.max(max , nums[i]);
            min = Math.min(min, nums[i]);
            
        }
        
        int ans = 0 ;
        for(int i :nums) ans += i-min;
        return ans;
    }
}
