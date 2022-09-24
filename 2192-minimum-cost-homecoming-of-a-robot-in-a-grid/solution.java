class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int cost =0;
        int dirx = homePos[0]<startPos[0] ? -1 : 1;
        int diry = homePos[1]<startPos[1] ? -1 : 1;
        
        while(startPos[0]!=homePos[0]) { startPos[0]+=dirx ; cost+=rowCosts[startPos[0]]; }
        while(startPos[1]!=homePos[1]) {startPos[1]+=diry ; cost+=colCosts[startPos[1]]; }
        return cost;
    }
}
