class NumArray {
    
    int sumarray[];

    public NumArray(int[] nums) {
    sumarray = new int[nums.length];
        if(nums.length!=0)
        sumarray[0]=nums[0];
        //NumArray obj = new NumArray();
        for(int i = 1 ; i<nums.length;i++)
            sumarray[i]= nums[i]+sumarray[i-1] ;
        
        
        
        
        
        
        
        
        //Arrays.fill(sumarray , Integer.MIN_VALUE);
    }
    
    public int sumRange(int i, int j) {
        if(i!=0)
            return (sumarray[j]-sumarray[i-1]);
        else
            return sumarray[j];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
