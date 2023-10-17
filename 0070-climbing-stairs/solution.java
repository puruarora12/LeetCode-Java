class Solution {
    public int climbStairs(int n) {
        int previous = 1;
        int previous2 = 2;
        if(n==1 ) return 1;
        if(n==2) return 2;
        int total =0;
        for(int i =3 ; i<=n ; i++ ){
            total = previous+ previous2;
            previous = previous2;
            previous2 =total;
        }
        return total;
    }
        
}
