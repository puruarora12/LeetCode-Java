class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int cost = 0 , i = startPos[0] , j  = startPos[1] , x = homePos[0] ,  y  = homePos[1] ;
        while(i!=x){
            i+=(x-i)/ Math.abs(x-i);
            cost+=rowCosts[i];
        }
        while(j!=y){
            j+=(y-j)/ Math.abs(y-j);
            cost+=colCosts[j];
        }
        return cost;
    }
}
