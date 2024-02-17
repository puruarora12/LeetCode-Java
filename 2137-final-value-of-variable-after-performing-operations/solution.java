class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for (String s: operations){
            //String sp[]= s.split("X");
            if(s.charAt(0)=='+'|| s.charAt(2)=='+' )ans++;
            else ans--;
        }
        return ans;
    }
}
