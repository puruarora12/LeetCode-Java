class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s =  new Stack<>();
        int ans[] = new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i =0  ; i<nums.length*2 ; i++){
            while(!s.isEmpty() && nums[s.peek()]<nums[i%nums.length])
                ans[s.pop()]=nums[i%nums.length];

            if(i<nums.length)s.push(i);
        }
        return ans;
    }
}
