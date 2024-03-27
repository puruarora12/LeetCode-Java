class Solution {
    public int firstMissingPositive(int[] nums) {
        int small = Integer.MAX_VALUE;
        int largest =Integer.MIN_VALUE;
        int ans =1 ;
        long sum=0;
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i]>0) { small=Math.min(small, nums[i]); sum+=nums[i];}
            largest= Math.max(largest, nums[i]);
            
        }
        if(small>1) return 1;
        if(largest*(largest+1)/2==sum) return largest+1;
         for(int i= 0;i<nums.length ; i++){ if(nums[i]<=0)nums[i]=1;
                                          if(nums[i]>nums.length) nums[i]=1;
                                          }
        //System.out.println("cross first loop");
        
        for(int i= 0;i<nums.length ; i++){
            if(nums[Math.abs(nums[i])-1]>0) nums[Math.abs(nums[i])-1]*=-1;
        }
        //  for(int i :nums)System.out.print(i+"  ");
        // System.out.println();
        int i = 0 ;
       
        for(i = 0 ; i<nums.length ; i++){
            if(nums[i]>=0) break;
        }
        return i+1;
    }
}
