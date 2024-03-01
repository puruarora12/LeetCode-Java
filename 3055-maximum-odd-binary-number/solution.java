class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1 = 0;
        for(String i:s.split("")) if(i.equals("1"))count1++;
        String ans = "";
        for(int i=0; i<count1-1;i++)ans+="1";
        for(int i =0 ; i<s.length()-count1; i++)ans+="0";
        ans+="1";
        return ans;
    }
}
