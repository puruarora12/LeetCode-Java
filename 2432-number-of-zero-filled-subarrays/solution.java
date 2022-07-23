class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long size= 0 ;
        long ans = 0;
        for(int i = 0 ; i <nums.length-1 ; i++){
            if(nums[i]==0){
                size++;
                if(nums[i+1]==0) continue;
                else  {
                    ans+= (size*(size+1))/2;
                    size=0;
                      }
            }
        }
        if(nums[nums.length -1 ]==0) ans+= ((size+1)*(size+2))/2;
        return ans;
    }
}



