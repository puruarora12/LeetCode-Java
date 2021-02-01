public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count;
        if (n>=0)
        count=0;
        else
            count=1;
        while(Math.abs(n)>0){
            n=n&(n-1);
            System.out.println(n);
            count++;
        }
        return count;
    }
}
