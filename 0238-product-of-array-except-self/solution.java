class Solution {
    public int[] productExceptSelf(int[] nums) {
       int ans[] = new int[nums.length];
        Arrays.fill(ans ,1);
        
        int temp =nums[0] ;
        
        for(int i =1; i<nums.length ; i++){
           ans[i] = temp;
            temp *= nums[i];
       } 
        
        temp=nums[nums.length-1];
        
        for( int j = nums.length-2 ; j>=0 ; j--){
           
            ans[j] *= temp ;
            temp *= nums[j];
            
        }
        return ans;
    }
    
    
    
}
