class Solution {
    public int mirrorReflection(int p, int q) {
        int m =1 , n=1;
        while(m*p != n*q){
            n++;
            m=n*q/p;
        }
        if(n%2==0) return 2;
        if(n%2!=0 && m%2==0) return 0;
        if(n%2!=0 && m%2!=0) return 1;
        return -1;
    }
}
