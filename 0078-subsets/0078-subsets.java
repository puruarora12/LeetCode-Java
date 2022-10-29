class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        sets(nums, ans , new ArrayList<Integer>() , 0);
        return ans;
    }
    
    
    private void sets(int[] nums ,ArrayList<List<Integer>> ans  , ArrayList<Integer> ar, int index){
        if(index >=nums.length) {
            ans.add(new ArrayList<Integer>(ar));
            return;
        }
        
        ar.add(nums[index]);
        sets(nums, ans , ar , index+1);
        
        ar.remove(ar.size()-1);
        sets(nums, ans ,ar , index+1);
    }
}