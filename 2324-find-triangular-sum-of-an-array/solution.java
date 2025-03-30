class Solution {
    public int triangularSum(int[] nums) {

        return checker(nums, nums.length);
    }
    public int checker(int[] nums , int limit){
        // System.out.println(nums);
        // int n = nums.size();
        if(limit==1) return nums[0];
        for(int i = 0 ; i<limit-1 ; i++){
            nums[i]= (nums[i]+nums[i+1])%10;
        }
        return checker(nums, limit-1);
    }
}
