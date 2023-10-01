class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxNumber = Long.MIN_VALUE;
        for(int i =0 ; i<nums.length-2 ; i++){
            for(int j = i+1 ; j<nums.length-1 ; j++){
                //if(nums[i]>nums[j])
                for(int k = j+1 ; k<nums.length ; k++){
                    long num = nums[i]-nums[j];
                    num*=nums[k];
                    //System.out.println(num);
                    if(num >maxNumber)
                        maxNumber = num;
                }
            }
        }
        if(maxNumber<=0)
            return 0;
        else 
            return maxNumber;
    }
}
