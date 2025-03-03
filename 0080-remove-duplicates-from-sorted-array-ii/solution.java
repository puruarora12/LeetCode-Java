class Solution {
    public int removeDuplicates(int[] nums) {
        int index=2;
        int i =2 ;
        if(nums.length<3) return nums.length;
        while(i<nums.length){
            if(nums[i]==nums[index-2]) i++;
            else{
                nums[index]=nums[i];
                i++;
                index++;
            }

        }
        return index;
    }
}
