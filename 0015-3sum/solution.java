class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> ar = new ArrayList<>();
        
        for(int i  =0  ; i <nums.length-2 ; i++){
            if(nums[i]>0) break;
                if(i== 0 || (i>0 && nums[i]!=nums[i-1])){
                //var sum = 0-nums[i];
                var left = i+1 ; 
                var right = nums.length-1 ;
                
                //System.out.println("before loop");
                while(left<right){
                   //System.out.println(nums[left]+nums[right]+"    and sum is "+nums[i]);
                    if(nums[i]+nums[left]+nums[right] ==0){
                        //System.out.println("in iff in loop");
                        ar.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++; 
                        right--;
                    }else if(nums[i]+nums[left]+nums[right]>0) right--;
                    else left++;
                }
                
            }    
        }
        
        return ar;
    }
}
