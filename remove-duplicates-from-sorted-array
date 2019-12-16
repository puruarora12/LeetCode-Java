class Solution {
    public int removeDuplicates(int[] nums) {
        /////////////////////////////////////
        
        int previous=0;
        for(int i =1; i<nums.length ; i++)
            if(nums[i]!=nums[previous]){
            
                nums[previous+1]=nums[i];
                previous++;
            }
        
        return previous+1;
        //////////////////////////////////
    }
}
