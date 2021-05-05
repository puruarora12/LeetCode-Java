class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ar[] = new int[nums1.length + nums2.length];
        for(int i = 0; i<nums1.length ; i++)
            ar[i]=nums1[i];
        for(int i =0 ; i<nums2.length ; i++)
            ar[nums1.length+i]=nums2[i];
       Arrays.sort(ar);
        for(int e: ar)
            System.out.print(e);
        System.out.println();
        if (ar.length%2!=0)
            return (double)ar[(int)Math.ceil(ar.length/2)];
        else
            return (double)((ar[ar.length/2]+ ar[(ar.length/2)-1])/2.0);
    }
}
