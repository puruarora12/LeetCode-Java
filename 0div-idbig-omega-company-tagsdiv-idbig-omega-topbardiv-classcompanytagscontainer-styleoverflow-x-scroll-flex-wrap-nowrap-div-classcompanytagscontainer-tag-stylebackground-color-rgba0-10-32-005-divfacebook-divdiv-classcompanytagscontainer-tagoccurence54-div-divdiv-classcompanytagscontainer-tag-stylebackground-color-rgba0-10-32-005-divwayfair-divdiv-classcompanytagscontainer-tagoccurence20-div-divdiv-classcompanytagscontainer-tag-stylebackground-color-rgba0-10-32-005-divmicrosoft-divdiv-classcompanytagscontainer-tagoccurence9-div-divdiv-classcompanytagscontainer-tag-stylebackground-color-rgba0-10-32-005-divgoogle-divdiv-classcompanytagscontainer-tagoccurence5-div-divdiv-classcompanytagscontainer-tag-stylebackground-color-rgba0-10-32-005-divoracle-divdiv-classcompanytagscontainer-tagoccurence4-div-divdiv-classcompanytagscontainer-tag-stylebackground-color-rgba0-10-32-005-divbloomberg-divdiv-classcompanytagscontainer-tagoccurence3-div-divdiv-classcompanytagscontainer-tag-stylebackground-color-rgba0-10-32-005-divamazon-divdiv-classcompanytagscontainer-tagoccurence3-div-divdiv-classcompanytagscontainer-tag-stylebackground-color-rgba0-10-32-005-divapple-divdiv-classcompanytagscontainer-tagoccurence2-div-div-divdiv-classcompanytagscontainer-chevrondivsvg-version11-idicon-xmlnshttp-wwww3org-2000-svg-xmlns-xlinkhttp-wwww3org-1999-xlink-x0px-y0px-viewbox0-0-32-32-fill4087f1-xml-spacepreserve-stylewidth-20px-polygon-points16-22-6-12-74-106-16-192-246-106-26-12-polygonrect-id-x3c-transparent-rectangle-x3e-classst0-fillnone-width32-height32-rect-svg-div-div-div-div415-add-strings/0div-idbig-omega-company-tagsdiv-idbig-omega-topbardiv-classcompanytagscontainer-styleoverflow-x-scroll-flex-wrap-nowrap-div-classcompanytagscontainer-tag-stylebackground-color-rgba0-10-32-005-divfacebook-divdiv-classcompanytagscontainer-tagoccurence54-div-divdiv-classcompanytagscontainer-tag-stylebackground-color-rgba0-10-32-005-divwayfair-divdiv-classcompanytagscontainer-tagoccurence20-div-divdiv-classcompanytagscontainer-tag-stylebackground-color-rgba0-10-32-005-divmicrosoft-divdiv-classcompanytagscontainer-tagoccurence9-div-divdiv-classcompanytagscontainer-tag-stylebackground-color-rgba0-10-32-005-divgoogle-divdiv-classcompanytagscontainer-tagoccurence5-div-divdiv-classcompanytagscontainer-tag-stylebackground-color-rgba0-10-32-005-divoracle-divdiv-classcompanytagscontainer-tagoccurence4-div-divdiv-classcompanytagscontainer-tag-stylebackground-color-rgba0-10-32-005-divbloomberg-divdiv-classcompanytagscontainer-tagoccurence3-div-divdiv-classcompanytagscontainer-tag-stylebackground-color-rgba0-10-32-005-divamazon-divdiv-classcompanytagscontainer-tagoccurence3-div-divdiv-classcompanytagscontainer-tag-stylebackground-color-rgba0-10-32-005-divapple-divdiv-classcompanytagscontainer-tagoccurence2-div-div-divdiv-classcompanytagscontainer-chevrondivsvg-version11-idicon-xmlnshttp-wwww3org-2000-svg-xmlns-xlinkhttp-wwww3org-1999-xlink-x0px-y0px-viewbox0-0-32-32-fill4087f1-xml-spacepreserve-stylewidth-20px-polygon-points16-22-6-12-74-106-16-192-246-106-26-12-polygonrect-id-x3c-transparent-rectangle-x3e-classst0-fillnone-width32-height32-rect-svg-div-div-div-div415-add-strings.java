class Solution {
    public String addStrings(String num1, String num2) {
        boolean carry = false;
        
        int len1 = num1.length()-1;
        int len2 = num2.length()-1;
        String ans = "";
        while(len1>=0  && len2>=0 ){
            
            int n1 = Integer.parseInt(num1.charAt(len1) +"");
            int n2 = Integer.parseInt(num2.charAt(len2) +"");
            System.out.println(n1 + " "+n2);
            int n3 = n2+n1;
            if (carry){ 
                n3++ ; 
                carry =false;
            }
            if(n3>=10){
                carry = true;
                n3 = n3%10;
            }
            ans = n3 +ans; 
            
            len1--;
            len2--;
        }
        
        System.out.println(ans);
        while(len1>=0){
            int n = 0;
            if(carry) {
                n =(Integer.parseInt(num1.charAt(len1) +"")+1 ) ;
                carry = false;
                if(n>=10) {
                    carry = true;
                    n = n%10;
                }
            }
            else n = Integer.parseInt(num1.charAt(len1) +"");
            
            ans = n +ans;
            len1--;
        }
        
                while(len2>=0){
           int n = 0;
            if(carry) {
                n =(Integer.parseInt(num2.charAt(len2) +"")+1 ) ;
                carry = false;
                if(n>=10) {
                    carry = true;
                    n = n%10;
                }
            }
            else n = Integer.parseInt(num2.charAt(len2) +"");
            
            ans = n +ans;
            len2--;
        }
        if(carry) ans = 1+ans;
        return ans;
    }
}