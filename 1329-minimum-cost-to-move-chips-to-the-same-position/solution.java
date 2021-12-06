class Solution {
    public int minCostToMoveChips(int[] position) {
      int odd = 0 ;
         int even = 0 ;
        for(int i = 0 ; i<position.length ; i++){
           if (position[i]%2==0) even++;
            else odd++;
        }
        return (Math.min(odd, even));
    }
}
