class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max =0 ;
        int len=1;
        if(nums.length<1)return 0;
        int num = nums[0];
        
        for(int i = 1 ; i<nums.length ; i++){
            
            if(nums[i]==num)continue;
            else if(nums[i]==num+1){
                    len++;
                    num++;
            }else{
                    max = Math.max(len, max);
                    len=1;
                    num=nums[i];
            }
            // System.out.println(i+"  "+nums[i]+"   "+num+"   "+len);
        }
        max=Math.max(max,len);
        return max;
    }
}
