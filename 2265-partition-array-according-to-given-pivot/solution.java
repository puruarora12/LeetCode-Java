class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int start =0 ;
        int sindex =0;
        int end = nums.length-1;
        int eindex= end;
        int ans[] =  new int[nums.length];

        while(start<nums.length && end>=0){
            if(nums[start]!=pivot && nums[start]<pivot) { ans[sindex]=nums[start]; sindex++;}
             start++;
            if(nums[end]!=pivot && nums[end]>pivot) { ans[eindex]=nums[end]; eindex--;}
            end--;

        }
        while(sindex<=eindex){
            ans[sindex]=pivot;
            sindex++;
        }
        return ans;
    }
}
