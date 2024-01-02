class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>(Arrays.asList(nums[0])));
        
        
        int row = 2;
        for(int i = 1 ; i <nums.length  ;i++){
            if(nums[i]!=nums[i-1]) row = 1;
            
            if(row>ans.size()) ans.add(new ArrayList<Integer>(Arrays.asList(nums[i])));
            else ans.get(row-1).add(nums[i]);     
            row++;
        }
        
        return ans;
    }
}
