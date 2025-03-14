class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int left[] = new int[n];
        left[0]=nums[0];
        int right[]  = new int[n];
        right[n-1]=nums[n-1];
        for(int i =1;i<n ; i++)left[i]=nums[i]*left[i-1];
        for(int i =n-2;i>=0 ; i--)right[i]=nums[i]*right[i+1];
        ans[0]=right[1];
        ans[n-1]=left[n-2];
        for(int i =1;i<n-1 ; i++){
             ans[i]=left[i-1]*right[i+1];
        }
        return ans;
    }
}
