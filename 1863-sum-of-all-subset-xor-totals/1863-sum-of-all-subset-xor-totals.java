class Solution {
    public int subsetXORSum(int[] nums) {
      return calculate(0,  0, nums);  
 
    }
    
    
    private int calculate(int index , int xor ,int[] nums){
        if(index>=nums.length){
            
            return xor;
        }
        int without = calculate( index+1 , xor , nums );
        int with =  calculate(index+1 , xor^nums[index], nums );
        return with+without;
    }
}