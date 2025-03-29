class Solution {
    public int search(int[] nums, int target) {
        int start =0 , end = nums.length-1;

        while(start<=end){
            // System.out.println(end+"   "+start);
            int mid= start+ (end-start)/2;
            // System.out.println("mid "+mid);
            if(nums[mid]==target) return mid;

            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && nums[mid]>=target)end=mid-1;
                else start=mid+1;
            }
            else{
                if(nums[mid]<=target && target<=nums[end])start=mid+1;
                else end=mid-1;
            }
            // System.out.println("afte done "+end+"   "+start);
        }
        return -1;
    }
}
