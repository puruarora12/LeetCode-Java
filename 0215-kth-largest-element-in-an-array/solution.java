class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int i = 0 ;i<nums.length ; i++){
             q.offer(nums[i]);
            if(q.size()>k) q.poll();
        }
        return q.peek();
    }
}
