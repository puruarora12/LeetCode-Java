class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(0, nums.length ,nums, target);
    }
    
    public int search(int left, int right , int[] nums , int target){
        if(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target) return mid ;
            else if (nums[mid]>target) return search(left ,mid , nums, target);
            else if(nums[mid]<target) return search(mid+1 ,  right , nums, target);
        }else return right;
        return 0;
    }
}
