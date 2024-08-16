class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = n*(n+1)/2;
        int diff = m;
        while(diff<=n){
            sum-=diff;
            sum-=diff;
            diff+=m;
 
        }
        return sum;
    }
}
