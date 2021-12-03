class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0) return  0 ;
        int cmax = nums[0];
        int cmin = nums[0];
        int result = nums[0];
        for(int i  =1 ; i<nums.length ; i++){
            if(nums[i]==0 ) {
                cmax =1 ; cmin =1 ;
                
            }
            int temp = cmax;
            cmax = Math.max(Math.max(nums[i]*cmax , nums[i]*cmin) , nums[i]);
            cmin = Math.min(Math.min(nums[i]*temp , nums[i]*cmin) , nums[i]);
            
            result = Math.max (result, cmax);
        }
        return result;
    }
}
