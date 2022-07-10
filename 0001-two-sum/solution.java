class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        for(int i =0 ; i<nums.length ; i++){
            if(s.containsKey(target-nums[i])) return (new int[]{i, s.get(target-nums[i])});
            else s.put(nums[i] ,i);
        }
        return null;
    }
}
