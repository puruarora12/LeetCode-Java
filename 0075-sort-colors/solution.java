class Solution {
    public void sortColors(int[] nums) {
        int[] freq = new int[3];
        for(int i:nums)freq[i]++;
        int index=0 ;
        int pos = 0;
        while(index<nums.length){
            while(freq[pos]>0 && index<nums.length ){
                nums[index++]=pos;
                freq[pos]--;
            }
            pos++;
        }

    }
}
