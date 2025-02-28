class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> ls = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        int ans[] = new int[nums1.length];
        Arrays.fill(ans,-1);
        for(int i=0; i<nums1.length ; i++){
            int pos = ls.indexOf(nums1[i]);
            for(int j = pos+1 ; j<nums2.length; j++)if(nums2[j]>nums1[i]) {ans[i]=nums2[j];break;}

        }
      return ans;  
    }
}
