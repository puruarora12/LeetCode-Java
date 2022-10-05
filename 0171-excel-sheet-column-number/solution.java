class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0 ;
        int index = 0;
        for(int i =columnTitle.length()-1;  i>=0 ; i-- ,index++){
            ans += Math.pow(26, index)*(columnTitle.charAt(i)-64);
        }
        return ans;
    }
}
