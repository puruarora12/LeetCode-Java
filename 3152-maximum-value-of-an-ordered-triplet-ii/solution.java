class Solution {
    public long maximumTripletValue(int[] nums) {
      int max = nums[0];
        long maxDiff = 0 ;
        long maxTriplet = 0 ;
        //int maxs[] = new int[nums.length];
        int mins[] = new int[nums.length];
        //maxs[0]=nums[0];
        mins[nums.length-1] = nums[nums.length-1];
        
        for(int i = nums.length-2 ; i>=0 ; i--){
           mins[i] = Math.max(mins[i+1], nums[i] ); 
        }
        
        
        for(int i =1 ; i <nums.length-1 ; i++){
            //System.out.println("max "+max + "   nums[i] "+nums[i]+"  mins[i+1] "+mins[i+1]);
            long diff = (max - nums[i]);
                diff*=mins[i+1];       
            maxDiff = Math.max(diff, maxDiff);
            
            
            max = Math.max(nums[i], max);
        }   
        
        return maxDiff;
    }
}
