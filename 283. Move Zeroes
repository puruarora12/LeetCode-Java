class Solution {
    public void moveZeroes(int[] nums) {
        int index =0 ; 
        int count = 0;
        for(int i = 0 ; i<nums.length; i++){
            if (nums[i]==0){
              count++;
                //index  = i ;
                
            }else{
                nums[index] = nums[i];
                index++;
            } 
        }
        for(int i=nums.length-count ; i<nums.length ; i++) nums[i]=0;
        
    }
}
