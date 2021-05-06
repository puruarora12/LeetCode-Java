import java.math.BigInteger ;
class Solution {
    public int myAtoi(String s) {
        int i =0 ;
        boolean neg = false;
        long num = 0 ;
        
        if(s.length()==0) return 0;
        
        while(i<s.length() && s.charAt(i)==' ') i++;
                
        
        if (i<s.length() && (s.charAt(i)=='-'  || s.charAt(i)=='+'))
                neg = s.charAt(i++)=='-' ? true : false;
                         
        //System.out.println(s.charAt(i));
                while(i<s.length() &&  s.charAt(i)>='0'   &&  s.charAt(i)<='9'){
                    num= num*10+ Integer.parseInt(""+s.charAt(i));
                    i++;
                    if (num>Integer.MAX_VALUE)
                        return neg ==true ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                    
            
            //System.out.println(num);
            return neg==true ? (int)num*-1 :(int)num;
    }
}
