class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Stack<int[]> stack = new Stack<>();
        int ans[] = new int[temps.length];
        for(int i =0 ; i<temps.length ; i++){
            while(!stack.isEmpty() && stack.peek()[0]<temps[i]){
                int[] cur = stack.pop();
                ans[cur[1]]=i-cur[1];

            }
            stack.push(new int[]{temps[i], i});
        }
        return ans;
    }
}
