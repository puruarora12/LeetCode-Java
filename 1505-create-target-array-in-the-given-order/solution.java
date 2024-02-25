class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ar = new ArrayList<>(nums.length);
        
        for(int i = 0 ; i <index.length ; i++){
            ar.add(index[i] , nums[i]);
        }
        int[] ans = ar.stream().mapToInt(i -> i).toArray();
        return ans;
    }
}
