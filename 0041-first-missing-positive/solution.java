class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean found[] = new boolean[nums.length];
        for(int i =0 ; i<nums.length; i++){
            if(nums[i]>0 && nums[i]<=nums.length) found[nums[i]-1]=true;
        }
        int i =1;
        for(i=0; i<nums.length ; i++)if(!found[i])return i+1;

        return nums.length+1;
    }
}
