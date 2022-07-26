class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==0) return false;
        while(n!=0){
           if(n%2!=0 && n!=1) return false;
            n=n/2;
            //System.out.println(n);
        } 
       // if (n==1) return false;
           // else 
                return true;
    }
}
