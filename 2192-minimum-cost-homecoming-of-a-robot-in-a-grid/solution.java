class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int cost =0;
        int dirx = homePos[0]<startPos[0] ? -1 : 1;
        int diry = homePos[1]<startPos[1] ? -1 : 1;
        
        for (int i = startPos[0]+dirx ; i-dirx!=homePos[0] ; i+=dirx) { cost+=rowCosts[i]; }
        for(int i =startPos[1]+diry ; i-diry!=homePos[1] ; i+=diry) { cost+=colCosts[i]; }
        return cost;
    }
}
