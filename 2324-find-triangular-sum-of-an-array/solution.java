class Solution {
    public int triangularSum(int[] nums) {
        return checker(Arrays.stream(nums).boxed().collect(Collectors.toList()));
    }
    public int checker(List<Integer> nums){
        // System.out.println(nums);
        int n = nums.size();
        if(n==1) return nums.get(0);
        for(int i = 0 ; i<n-1 ; i++){
            nums.set(i , (nums.get(i)+nums.get(i+1))%10);
        }
        nums.remove(n-1);
        return checker(nums);
    }
}
