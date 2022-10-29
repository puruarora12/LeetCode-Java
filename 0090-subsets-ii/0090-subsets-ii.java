class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(0 ,nums ,ans , new ArrayList<Integer>() );
        return ans;
    }
    
    private void generate(int index  , int[] nums , List<List<Integer>> ans,  List<Integer> ar){
        if(index >=nums.length){
            ArrayList<Integer> arr = new ArrayList<>(ar);
            Collections.sort(arr);
            if(!ans.contains(arr))
            ans.add(new ArrayList<>(arr));
            return ;
        }
        
        ar.add(nums[index]);
        generate(index + 1 , nums ,ans , ar);
        
        ar.remove(ar.size()-1);
        generate(index + 1 , nums ,ans , ar);
        
    }
}