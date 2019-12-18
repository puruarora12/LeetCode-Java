class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0  , j= 0 , k=0;
        int arr[] = new int[nums1.length + nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j])
                arr[k++]=nums1[i++];
            else
                arr[k++]=nums2[j++];
        }
        
        while(i<nums1.length)
            arr[k++]=nums1[i++];
        while(j<nums2.length)
            arr[k++]=nums2[j++];
        if(arr.length%2==0){
            System.out.println(arr[arr.length/2]+"     "+arr[(arr.length/2)-1]);
            return ((arr[arr.length/2]+arr[(arr.length/2)-1]))/2.0;
        
        }else
            return arr[arr.length/2];
    }
}
