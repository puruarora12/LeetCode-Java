class Solution {
    public int reverse(int x) {
        int number = Math.abs(x);
        long revnumber =0;
        while(number>0){
            revnumber = revnumber*10+number%10;
            number/=10;
        }
        if(x<0)
            revnumber*=-1;
        if(revnumber<Integer.MIN_VALUE || revnumber > Integer.MAX_VALUE)
            return 0;
        else
            return (int)revnumber;
    }
}
