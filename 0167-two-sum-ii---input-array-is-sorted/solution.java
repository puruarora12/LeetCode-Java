class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        for(int i =0 ; i<nums.length ; i++){
           int ans[]=new int[2];
            if(s.containsKey(target-nums[i])) {
                ans = new int[]{i+1, s.get(target-nums[i])+1};
                Arrays.sort(ans);
                return ans; 
            }
            else s.put(nums[i] ,i);
            
        }
        return null;
    }
}
