class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        // int max = nums[0];
        int[] maxs = new int[nums.length];
        // int[] mins = new int[nums.length];
        // Arrays.fill(maxs,0);
        // Arrays.fill(mins,0);
        maxs[nums.length-1]=nums[nums.length-1];

        for(int i = nums.length-2 ; i>=0 ; i--){
            //  System.out.println("Max at "+i+"  : "+nums[maxs[i]]+"  min :"+nums[mins[i]]);
            //  System.out.println("Max at -1 values "+(i-1)+"  : "+nums[maxs[i-1]]+"  min :"+nums[mins[i-1]]);
            maxs[i]  = Math.max(maxs[i+1], nums[i]);

            // System.out.println("Max at "+i+"  : "+maxs[i]);//+"  min :"+nums[mins[i]]);
        }
        long large = nums[0];
        for(int i =0 ; i<nums.length-1 ;i++){
            // System.out.println("the calc is "+(large - nums[i])* maxs[nums.length-1] );
            ans = Math.max(ans, (large - nums[i])* maxs[i+1] );
            large = Math.max(nums[i], large);

        }
        return ans;
    }
}
