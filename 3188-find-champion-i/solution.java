class Solution {
    public int findChampion(int[][] grid) {
        int max = Integer.MIN_VALUE;
        int index  =0 ;
        int i =0 ;
        for(int ar[] : grid){
            int sum =IntStream.of(ar).sum();;
            if(sum>max) {
                max = sum ; 
                index  = i;
            }
            
            i++;
        }
        return index;
    }
}
