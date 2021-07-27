class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int mindiff = Integer.MAX_VALUE ; 
        int sum = 0 ; 
        for(int i =0 ; i <nums.length-2 ; i++){
            for(int j = i+1 ;j<nums.length-1 ; j++ ){
                for(int k = j+1  ; k<nums.length ; k++){
                    int ad = nums[i] + nums[j]+nums[k];
                    int diff = target -ad ;
                    if(Math.abs(diff)<mindiff) {
                        mindiff = Math.abs(diff);
                        sum=ad;
                    }
                }
            }
        }
        return sum ;
        
    }
}
