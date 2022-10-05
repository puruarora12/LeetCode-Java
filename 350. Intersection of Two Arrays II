class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ar= new ArrayList<Integer>();
        int index1 = 0 ;
        int index2 = 0 ; 
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(index1 <nums1.length && index2 <nums2.length){
            if(nums1[index1]==nums2[index2]) { ar.add(nums2[index2]); index1++ ; index2++; }
            else if(nums1[index1]<nums2[index2]) index1++;
            else if(nums1[index1]>nums2[index2]) index2++;
        }
        
        return ar.stream().mapToInt(i->i).toArray();
    }
}
