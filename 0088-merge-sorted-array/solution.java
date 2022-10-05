class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0 ;
        int index2 = 0 ;
        Queue<Integer> q = new PriorityQueue<>();
        
        for(int i:nums2) q.offer(i);
        
        while(index1<nums1.length && q.size()!=0){
            if(index1>=m) {
                nums1[index1] = q.poll();
                index1++;
            }
            else if(nums1[index1]>q.peek()){
                q.offer(nums1[index1]);
                nums1[index1]= q.poll();
                index1++;
            }
            else if(nums1[index1]==q.peek()) index1++;
            else if(nums1[index1]<q.peek()) index1++; 
        
           // for(int i:nums1) System.out.print(i+" ");
            //System.out.println();
        }
      
    }
}
