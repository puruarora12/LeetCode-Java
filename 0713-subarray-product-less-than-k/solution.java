class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left =0;
        int right = 0;
        int product = 1;
        int sum =0;
        while(right<nums.length && left<=right){
            product *=nums[right];
            if(product<k){
                
                sum+=right-left+1; 
            }else{
                  while(product>=k && left<=right){
                product/=nums[left];
                left++;
            }
                 int len =right-left;
                //product/=nums[right];
                sum+=len+1;
            }
            right++;
        }
     
        return sum;
    }
}
