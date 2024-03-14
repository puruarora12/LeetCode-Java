class Solution {
    public int pivotInteger(int n) {
        int left = (int)Math.sqrt(n);
        long totalsum= n*(n+1)/2;
        long leftsum = left*(left+1)/2;
        long rightsum = totalsum-leftsum+left;
        while(leftsum<rightsum){
            //System.out.println(leftsum+"     "+rightsum);
            left++;
            leftsum= left*(left+1)/2;
            rightsum=totalsum-leftsum+left;
        }
        //System.out.println(leftsum+"   "+rightsum);
        if(leftsum==rightsum) return left;
        else return -1;
    }
    
}
