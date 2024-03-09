class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int a1=0;
        int a2=0;
        while(a1<nums1.length && a2<nums2.length){
            if (nums1[a1]==nums2[a2])return nums1[a1];
            else if (nums1[a1]>nums2[a2])a2++;
            else a1++;
        }
        return -1;
    }
}
