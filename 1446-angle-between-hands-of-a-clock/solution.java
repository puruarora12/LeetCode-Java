class Solution {
    public double angleClock(int hour, int minutes) {
        double hdiff = (hour*60 +minutes)*0.5;
        double mdiff = minutes*6;
        
        double ans =Math.abs(mdiff-hdiff);
       
        return (ans)>180 ? Math.abs(360 -ans) : ans;
        
    }
}
