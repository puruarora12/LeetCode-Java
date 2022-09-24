/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return check(1 , n  ,n );
    }
    
    private int check(int left , int right , int n){
    int mid = left + (right-left+1)/2;
    if(left<=right && left>0 && right<=n){
    if ( (mid-1!=0 && !isBadVersion(mid-1) ) && isBadVersion(mid)) return mid ;
    if (isBadVersion(mid)) return check(left , mid-1 ,  n );
    else return check(mid, right, n);
        }
    return mid;
    }
}
