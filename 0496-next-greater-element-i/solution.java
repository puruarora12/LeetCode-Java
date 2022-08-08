class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1);
        int index  =0;
        while(index<nums1.length){
            boolean eq =false;
        for(int i = 0 ; i<nums2.length ; i++){
            if(nums1[index]==nums2[i]) eq=true;
            
            if(eq && nums2[i]>nums1[index]) {ans[index]=nums2[i]; break;}
            }
            index++;
        }
        return ans;
    }
}
