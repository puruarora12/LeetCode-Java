class Solution {
    public int longestConsecutive(int[] nums) {
        // 5/7 inspection
        int n =nums.length;
        Arrays.sort(nums);
        int max =0;
        int len =1 ;
        if(n<=1)return n;
        int num =nums[0];
        for(int i =1 ; i<n ; i++){
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
