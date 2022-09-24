class Solution {
    public int search(int[] nums, int target) {
        
        //int mid = nums.length/2;
        return find(0, nums.length-1 ,nums , target );
    }
    
    private int find(int left, int right , int[] nums, int target){
        if(left<=right){
        int mid = left+ (right-left)/2;
        if(target==nums[mid]) return mid;
        else if (target>nums[mid]) return find(mid+1 , right,  nums,target);
        else if(target<nums[mid]) return find(left, mid-1 , nums, target);
        }
        return -1;
    }
}
