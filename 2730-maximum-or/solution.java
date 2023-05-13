class Solution {
    public long maximumOr(int[] nums, int k) {
        long pre[]  = new long[nums.length+1];
        long suf[]  = new long[nums.length+1];
        
        
        long p = 1;
        while(k-->0) p*=2;
        //System.out.println(p);
        
        pre[0]=0;
        for(int  i=0 ; i<nums.length ; i++) pre[i+1] = pre[i] | nums[i];
        
        suf[nums.length]=0;
        for(int i = nums.length-1 ; i>=0 ; i--) suf[i] = suf[i+1] | nums[i];
        
        long ans = 0;
        for(int i = 0 ; i<nums.length ; i++){
            ans = Math.max(ans , pre[i] | suf[i+1] | (nums[i]*p));
        }
            
        return ans;
    }
}
