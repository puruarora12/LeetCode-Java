class Solution {
    public String addBinary(String a, String b) {
        int carry = 0 ;
        int i = a.length()-1;
        int j = b.length()-1;
        String ans = "";
        while(i>=0 || j>=0 || carry ==1){
            int n1 =0;
            int n2=0 ;
            if(i>=0){
                n1 = a.charAt(i)-'0';
                i--;
            }
            
            if(j>=0){
                n2 = b.charAt(j)-'0';
                j--;
            }
            
            int sum = n1+n2+carry;
            carry=0;
            if(sum==2) {carry =1 ; sum=0;}
            else if(sum==3) {carry=1; sum=1 ;}
            ans=sum+ans;
        }
        return ans;
    }
}
