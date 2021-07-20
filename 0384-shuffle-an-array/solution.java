class Solution {
    Stack<Integer> ar = new Stack<>();
    int arr[] ;
    int dup[];
    public Solution(int[] nums) {
           arr= nums;
        
        dup=arr.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        
        return dup;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        /*while(!ar.isEmpty()) {
            int temp = arr[ar.peek()];
            arr[ar.pop()] =arr[ar.peek()];
            arr[ar.pop()]=temp;
        }*/
        int dup[] =  arr.clone();
        int n1 = (int)(Math.random()*arr.length);
        int n2 = (int)(Math.random()*arr.length);
        ar.push(n1);
        ar.push(n2);
        int temp = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
