class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int count = Integer.MIN_VALUE;
        for(int i = 0 ; i <nums1.length ; i++){
            for(int j = 0 ; j 
<nums2.length ; j++){
                int size =0 ;
                if (nums1[i]==nums2[j]){
                   int new_j=checkmatch(nums1,nums2, i,j);
                    size = new_j-j;
                }
                if(size>count)
                    count =size;
            }
        }
        return count;
    }
    
    
    public static int checkmatch(int num1[] , int num2[] , int i , int j){
        while(i<num1.length && j<num2.length && num1[i]==num2[j]){
            i++;
            j++;
        }
        return j ;
    }
}
