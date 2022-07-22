class Solution {
    public int climbStairs(int n) {
     int[] dp = new int[n+1];
        int i1=1;
        int i2 =2;
        for(int i =2 ; i<n+1; i++){
            int temp = i1+i2;
            i1 =i2;
            i2 =temp;
        }
        return i1;
    }
}

//1 2 3 5 8 13
