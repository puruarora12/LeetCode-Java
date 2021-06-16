class Solution {
    public int[] productExceptSelf(int[] nums) {
        int forward_multiply[] = new int[nums.length];
        int backwards_multiply[] = new int[nums.length];
        forward_multiply[0]=nums[0];
        backwards_multiply[nums.length-1]=nums[nums.length-1];
        int ans[] = new int[nums.length];
        Arrays.fill(ans,1);
        for(int i = 1 ; i <nums.length ; i++)
            forward_multiply[i]=nums[i]*forward_multiply[i-1];
        for(int i = nums.length-2 ; i >=0 ; i--)
            backwards_multiply[i]=nums[i]*backwards_multiply[i+1];
        for(int i = 0 ; i <nums.length ; i++){
            if(i+1<nums.length) ans[i]=backwards_multiply[i+1];
            if ((i-1)>=0)          ans[i]=ans[i]*forward_multiply[i-1];
        }
        return ans;
    }
}
