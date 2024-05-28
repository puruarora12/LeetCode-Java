class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int num = 1 ;
        boolean found = false;
        for(int i = nums.length-1 ; i>=0;i--){
            //System.out.println(nums[i-1] +"   "+num+"   "+nums[i]  );
            if(i-1>=0 && (nums[i-1]<num && nums[i]>=num)) {
                found =true;
                
                return num;
            }else if(i==0){
                if(nums[i]>=num) return num;
            }
                else num++;
        }
        return -1;
    }
}
