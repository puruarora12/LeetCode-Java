class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int ans[] = new int[2];
        int pos = 0;
        int n =nums[0];
        for(int i =1 ; i<nums.length ; i++ ){
            if(nums[i]==nums[i-1]){
                ans[pos]= nums[i];
                pos++;
            }
        }        
        return ans;
    }
}
