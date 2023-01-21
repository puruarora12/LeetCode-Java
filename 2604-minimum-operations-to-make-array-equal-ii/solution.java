class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
         //int index = 0;
        long operations = 0 ;
         int count = 0 ; 
        if(k==0){
             for(int i = 0 ; i<nums1.length ; i++) if(nums1[i]!=nums2[i]) return -1;
            return 0;
        }
        for(int index = 0 ; index<nums1.length ; index++){
            //System.out.println("nums1 "+nums1[index]+"   nums2  "+nums2[index]);
            if(nums1[index] ==nums2[index]) continue;
            
            
            else if(nums1[index]<nums2[index] ){
                
                int diff = nums2[index]-nums1[index];
                if(diff>=k && diff%k==0){ 
                    operations += diff/k;
                    count+=diff;
                    nums1[index]=nums2[index];
                }
                else return -1;
            }
            else{
                int diff = nums1[index]-nums2[index];
                if(diff>=k && diff%k==0){ 
                    operations += diff/k;
                    count-=diff;
                    nums1[index]=nums2[index];
                }
                else return -1;
            }
            
            //System.out.println(operations);
        }
        //System.out.println("/////////////////////////////");
        for(int i = 0 ; i<nums1.length ; i++) if(nums1[i]!=nums2[i]) return -1;
        if(count==0) return operations/2;
        else return -1;
    }
}
