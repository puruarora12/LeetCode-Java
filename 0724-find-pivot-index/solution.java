class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for (int i :nums) sum+=i;
        int leftsum=0;
        for(int i = 0 ; i<nums.length ; i++){
            if (sum-nums[i]-leftsum==leftsum) return i;
            else leftsum+=nums[i];
        }
        return -1;
    }
}
