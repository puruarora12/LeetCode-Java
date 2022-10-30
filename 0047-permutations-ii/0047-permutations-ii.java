class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        //Arrays.fill(check , true);
        findPermutes(0 , nums , ans , new ArrayList<>()  ,check );
        return ans;
    }
    
    private void findPermutes(int index, int[] nums, List<List<Integer>> ans , List<Integer> ar , boolean[] check){
        if(ar.size()==nums.length){
            if(!ans.contains(ar))
            ans.add(new ArrayList<>(ar));
            return;
        }
        
        for(int i = 0 ; i<nums.length ; i++){
            if(!check[i]){
                ar.add(nums[i]);
                check[i]=true;
                findPermutes(i , nums, ans , ar ,check);
                ar.remove(ar.size()-1);
                check[i]=false;
            }
        }
    }
}