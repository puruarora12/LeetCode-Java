import java.math.BigInteger ;
class Solution {
    public int myAtoi(String s) {
        if(s.length()==0)
            return 0;
        int i =0 ;
        while(i<s.length() && s.charAt(i)==' ')
            i++;
        //System.out.println(i);
        boolean neg = false;
        String num = "" ; 
        
        if (i<s.length() && s.charAt(i)=='-'){
                neg = true;
                i++;
                //System.out.println(neg);
            }
            else if (i<s.length() && s.charAt(i)=='+'){
                i++;
            }
            else{
                
            }
        
        if (i<s.length() && ((s.charAt(i)>='0' && s.charAt(i)<='9') )  ){  
            
                while(i<s.length() &&  s.charAt(i)>='0'   &&                        s.charAt(i)<='9'){
                    num= num+ s.charAt(i);
                    i++;
                }
                    
            
            System.out.println(num);
            int ans  = 0 ;
            BigInteger bnum ;
            if (neg==true)
            bnum = new BigInteger("-"+num);
            else
                 bnum = new BigInteger(num);
            
            //long lnum =  Long.parseLong(num);
            
            BigInteger minvalue = new BigInteger(""+ Integer.MIN_VALUE);
            BigInteger maxvalue = new BigInteger(""+ Integer.MAX_VALUE);
            
            if (neg ==true && bnum.compareTo(minvalue)<0)
                return Integer.MIN_VALUE;
            else if (neg ==false && bnum.compareTo(maxvalue)>0)
                return Integer.MAX_VALUE;
            else
                ans = Integer.parseInt(""+bnum);
                
            //if (neg==true)
             //   return ans*(-1);
            //else
                return ans ;
        }
        else 
            return 0;
    }
}
