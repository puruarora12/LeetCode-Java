class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
        int prev = Integer.MIN_VALUE;
        for(int i:nums){
            if(prev==i) return true;
            prev=i;
        }
        return false;
    }
}
