class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int patlen = pattern.length;
        int count = 0;
        for(int i= 0 ; i<nums.length-patlen ; i++){
            
            boolean check = true;
            for(int j = 0;j<patlen; j++){
                if(nums[i+j]<nums[i+j+1] && pattern[j]==1)continue;
                else if(nums[i+j]==nums[i+j+1] && pattern[j]==0)continue;
                else if(nums[i+j]>nums[i+j+1] && pattern[j]==-1)continue;
                else {check =false; break;}
            }
            if(check)count++;
        }
        return count;
    }
}
