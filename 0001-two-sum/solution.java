class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ar[]= new int[2] ; 
        for (int i =0 ; i<nums.length; i++){
            for(int j =i+1 ; j<nums.length ; j++){
                if (target-nums[i]==nums[j]){
                    ar[0] =i;
                    ar[1] = j;
                return ar;
                }
            }
        }
        return null;
    }
}
