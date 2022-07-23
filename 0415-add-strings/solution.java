class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        String ans = "";
        while(i>=0 || j>=0 || carry==1){
        int n1 = 0;
        int n2= 0;
            if(i>-1) {
                n1 = num1.charAt(i) -'0';
                i--;
            }
            if(j>-1) {
                n2 = num2.charAt(j) -'0';
                j--;
            }
            int temp = n1+n2+carry;
            ans= temp%10 + ans;
            carry = temp/10;
        }
        
        return ans;
    }
}
