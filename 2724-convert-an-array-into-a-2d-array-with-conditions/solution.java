class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>(Arrays.asList(nums[0])));
        
        //System.out.println("After first insert "+ans.size()+"   "+ans.get(0));
        int row = 2;
        for(int i = 1 ; i <nums.length  ;i++){
            if(nums[i]!=nums[i-1]) row = 1;
            
            if(row>ans.size()){
                //System.out.println("in if row>ans "+row+"  "+ans.size()+" the element is "+nums[i]);
                ans.add(new ArrayList<Integer>(Arrays.asList(nums[i])));
                //System.out.println("ans size after "+ans.size());
            }else{
                
                ans.get(row-1).add(nums[i]);
                //System.out.println("adding the element "+nums[i]);
            }
            
            
            //for (List<Integer> z : ans){
            //    System.out.println(z);
            //}
            //System.out.println();
            //System.out.println(ans.size());
            
            row++;
        }
        
        return ans;
    }
}
