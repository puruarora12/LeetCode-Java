class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count =0 ;
        
        for(int i = 0 ; i <nums.length ; i++){
            //System.out.println(nums[i]);
            for(int  j = nums.length-1 ; j>=0; j-- ){
                if (i!=j){
                    //System.out.println("inside loop");
                    int left =i+1 ; 
                    int right = j-1 ; 
                    while(left<nums.length && nums[left]<=Math.abs(nums[i]-nums[j])) left++;
                    while(right>0 && nums[right]>nums[i]+nums[j]) right--;
                    
                    if(right<left) {
                     //System.out.println("right "+right + "  left "+left);
                        continue;
                    }
                    //System.out.println(" nums[i] "+nums[i]+" nums[j]"+ nums[j]+"  [left] "+left+" [right]                           "+right );
                    count += right-left+1;
                }
            }
        }
        return count;
    }
}
