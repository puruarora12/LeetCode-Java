class Solution {
    public int removeDuplicates(int[] nums) {
        int previous = 0;
        int index = 1; 
        for (int i = 1 ; i <nums.length ; i++){
            if (nums[i]!=nums[previous]){
                nums[index]=nums[i];
                previous++;
                index++;
            }           
        }
        return index;
    }
}
