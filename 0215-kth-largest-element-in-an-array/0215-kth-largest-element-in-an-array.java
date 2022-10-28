class Solution {
    public int findKthLargest(int[] nums, int k) {
        k=nums.length -k;
        Queue<Integer> q = new PriorityQueue<>();
        for(int i = 0 ;i<nums.length ; i++) q.offer(nums[i]);
        while(k-->0) q.poll();
        return q.peek();
    }
}