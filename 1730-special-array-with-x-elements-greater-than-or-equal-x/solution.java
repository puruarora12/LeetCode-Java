class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int num = 1 ;
        for(int i = nums.length-1 ; i>=0;i--){
            if(i-1>=0 && (nums[i-1]<num && nums[i]>=num))  return num;
            else if(i==0 && nums[i]>=num) return num;
            else num++;
        }
        return -1;
    }
}
