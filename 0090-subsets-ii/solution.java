class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        generate(0 ,nums ,ans , new ArrayList<Integer>() , false );
        return ans;
    }
    
    private void generate(int index  , int[] nums , List<List<Integer>> ans,  List<Integer> ar , boolean choosen){
        if(index >=nums.length){
            
            //if(!ans.contains(ar))
            ans.add(new ArrayList<Integer>(ar));
            return ;
        }
        generate(index + 1 , nums ,ans , ar ,false);
        if(index-1>=0 && nums[index]==nums[index-1] && !choosen) return;
        
        ar.add(nums[index]);
        generate(index + 1 , nums ,ans , ar,true);
        ar.remove(ar.size()-1);
        
    }
}
