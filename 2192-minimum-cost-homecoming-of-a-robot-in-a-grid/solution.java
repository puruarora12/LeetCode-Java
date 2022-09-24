class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int cost = 0 ;//, i = startPos[0] , j  = startPos[1] , x = homePos[0] ,  y  = homePos[1] ;
        
        if(homePos[0]<startPos[0]) while(startPos[0]!=homePos[0]){ startPos[0]-=1 ; cost+=rowCosts[startPos[0]] ; }
        
         else if(homePos[0]>startPos[0]) while(startPos[0]!=homePos[0]){ startPos[0]+=1 ; cost+=rowCosts[startPos[0]] ; }
        
         if(homePos[1]<startPos[1]) while(startPos[1]!=homePos[1]){ startPos[1]-=1 ; cost+=colCosts[startPos[1]] ; }
        
         else if(homePos[1]>startPos[1]) while(startPos[1]!=homePos[1]){ startPos[1]+=1 ; cost+=colCosts[startPos[1]] ; }
         
        return cost;
    }
}
