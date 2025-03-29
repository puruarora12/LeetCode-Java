class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[temps.length];
        for(int i =0 ; i<temps.length ; i++){
            while(!stack.isEmpty() && temps[stack.peek()]<temps[i]){
                int cur = stack.pop();
                ans[cur]=i-cur;

            }
            stack.push( i);
        }
        return ans;
    }
}
