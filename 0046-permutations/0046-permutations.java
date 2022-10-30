class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPermutes(0 , nums , ans , new ArrayList<>());
        return ans;
    }
    
    private void findPermutes(int index, int[] nums , List<List<Integer>> ans, List<Integer> ar){
        if(ar.size()==nums.length){
            ans.add(new ArrayList<>(ar));
            return ;
        }
        
       for(int i =0 ; i<nums.length ; i++){
           if(ar.contains(nums[i])) continue;
            ar.add(nums[i]);
            findPermutes(i+1 , nums , ans,ar);
            ar.remove(ar.size()-1);
        }
    }
}