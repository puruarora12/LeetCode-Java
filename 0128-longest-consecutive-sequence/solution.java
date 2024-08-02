class Solution {
    public int longestConsecutive(int[] nums) {
        // 5/7 inspection
        Arrays.sort(nums);
        int max =0;
        int len =1 ;
        if(nums.length<=1)return nums.length;
        int num =nums[0];
        for(int i =1 ; i<nums.length ; i++){
            if(nums[i]==num+1){
                len++;
                num++;
            }
            else if(nums[i]==num){continue;                
            }else{
                max=Math.max(max,len);
                len=1;
                num=nums[i];
            }
        }
        max = Math.max(len,max);
        return max;

        }
}
