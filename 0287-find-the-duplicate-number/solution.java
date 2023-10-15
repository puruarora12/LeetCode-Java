class Solution {
    public int findDuplicate(int[] nums) {
        int ans =0;
        for (int num : nums){
            int index = Math.abs(num);
            if(nums[index]<0){
                ans = index;
                break;
            }
            nums[index]*=-1;
        }
        return ans;
    }
}
