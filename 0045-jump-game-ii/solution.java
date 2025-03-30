class Solution {
    public int jump(int[] nums) {
        int farthest = 0 ; 
        int reached = 0;
        int jumps =0 ;
        for(int i = 0 ; i<nums.length- 1; i++){
            farthest = Math.max(i+nums[i], farthest);
            if(reached==i){
                jumps++;
                reached =farthest;
            if(farthest>=nums.length-1) break;
            }
            

        }
        return jumps;
    }
}
