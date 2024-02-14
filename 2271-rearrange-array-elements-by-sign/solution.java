class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int index = 0;
        int pos  = 0;
        int neg = 0;
        
        while(pos<nums.length && neg<nums.length){
            if(index%2==0 && nums[pos]>=0){
                ans[index]=nums[pos];
                index++;
                pos++;
            }
            else if(index%2==0 && nums[pos]<0)pos++;
            else if(index%2!=0 && nums[neg]<0){
                ans[index]=nums[neg];
                index++;
                neg++;
            }else if(index%2!=0 && nums[neg]>0) neg++;
            else continue;
        }
       // System.out.println("index "+index+"  pos "+pos+"   neg "+neg);
        if(index<nums.length){
            if(pos<nums.length){
                while(nums[pos]<0)pos++;
                ans[index]=nums[pos];
                index++;
                pos++;
            }
            else {
                while(nums[neg]>0)neg++;
                ans[index]=nums[neg];
                index++;
                neg++;
            }
        }
        return ans;
    }
}
