class Solution {
    public int removeDuplicates(int[] nums) {
        /////////////////////////////////////
        int count = 0 ; 
        int previous=0;
        if(nums.length>0)
         previous = nums[0];
        for(int i =1; i<nums.length ; i++)
            if(nums[i]==previous){
                nums[i]=Integer.MAX_VALUE;
                count++;
            }
            else
                previous=nums[i];
        Arrays.sort(nums);
        return (nums.length-count);
        //////////////////////////////////
    }
}
