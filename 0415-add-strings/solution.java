class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        String ans = "";
        while(i>=0 && j>=0){
            int temp = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(j))+carry;
            ans = temp%10 +ans;
            carry = temp/10;
            i--;
            j--;
        }
        
        while(i>=0){
           int temp = Character.getNumericValue(num1.charAt(i))+carry;
            ans = temp%10 +ans;
            carry = temp/10;
            i--;
        }
            while(j>=0){
                 int temp = Character.getNumericValue(num2.charAt(j))+carry;
            ans = temp%10 +ans;
            carry = temp/10; 
            j--;
            }
         if(carry==1)ans=1+ans;
        return ans;
    }
}
