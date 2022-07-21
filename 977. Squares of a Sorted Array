class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0 ; 
        int j = nums.length - 1;
        for(int index = nums.length-1 ; index>=0 ; index-- ){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                ans[index] =nums[i]*nums[i];
                i++;
                    
            }else{
                ans[index] =nums[j]*nums[j];
                j--;
            }
        }
        return ans;
    }
}
