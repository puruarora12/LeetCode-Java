class Solution {
    public long coloredCells(int n) {
        long ans = 0;
        long side = n*2-1;
        ans +=side;
        
        while(side>1){
        side = side-2;
        ans += side*2; 
        }
        return ans;
    }
}
