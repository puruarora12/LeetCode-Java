class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            if(i==0) left[i]=nums[i];
            else left[i]=nums[i]*left[i-1];
        }
        for(int i = nums.length-1  ; i>=0 ; i--){
            if(i==nums.length-1) right[i]=nums[i];
            else right[i]=nums[i]*right[i+1];
        }
      
        int ans[] = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++)
            if(i==0) ans[i]=right[i+1];
            else if(i==nums.length-1) ans[i]=left[i-1];
            else ans[i]=left[i-1]*right[i+1];
    return ans;
    }
    
}
