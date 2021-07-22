class Solution {
    public int partitionDisjoint(int[] nums) {
        int max[] = new int[nums.length];
        int min[] = new int[nums.length];
        max[0] = nums[0];
        for(int i = 1 ; i <nums.length ; i++){
            max[i] = max[i-1] > nums[i-1] ? max[i-1] : nums[i-1];   
            System.out.print(max[i]+" ");
        }
       System.out.println(); 
        min[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2 ; i>=0 ; i--){
            min[i] = min[i+1]>nums[i+1]? nums[i+1] : min[i+1];
        //System.out.print(min[i]+" ");
        }
        for(int i :min) System.out.print(i+" ");
        
        for(int i = 0 ; i<nums.length  ; i++){
            if(max[i]<=min[i])
                return i+1 ; 
            else continue;
        }
    return 1;
    }
}
