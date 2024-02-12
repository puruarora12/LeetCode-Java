class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length- nums.length/2 ; i++){
            //System.out.println(i+"   "+(i+(int)Math.floor(nums.length/2)));
            if(nums[i]==nums[i+(int)Math.floor(nums.length/2)]) return nums[i];
        }
        return -1;
    }
}
