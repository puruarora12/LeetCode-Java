class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length==0 ) return 0 ; 
        int cmin = nums[0];
        int cmax = nums[0];
        int res =nums[0] ;
        for(int i = 1 ; i<nums.length ; i++){
            if (nums[i]==0){
                cmax =1 ; cmin =1 ;
            }
            int temp = cmax ;
            //System.out.println(nums[i]);
            cmax = Math.max(Math.max(nums[i]*cmin , nums[i]*cmax) , nums[i]);
            
            cmin = Math.min(Math.min(nums[i]*cmin , nums[i]*temp) , nums[i]);
            //System.out.println( "cmax "+cmax+" and cmin "+cmin  );
            res = Math.max(cmax , res);
        }
        return res;
    }
}
