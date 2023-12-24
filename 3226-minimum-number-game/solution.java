class Solution {
    public int[] numberGame(int[] nums) {
        int[] solution = new int[nums.length];
        //int index = 0;
        
        Arrays.sort(nums);
        for(int i = 0 ; i <nums.length ; i=i+2){
            solution[i]= nums[i+1];
            solution[i+1] = nums[i];
        }
        return solution;
    }
}
