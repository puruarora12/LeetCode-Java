class Solution {
    public String longestPalindrome(String s) {
        int len1 =0, len2 = 0 ; 
        int temp = Integer.MIN_VALUE;
        String ans = ""+s.charAt(0);
        for (int i = 0; i<s.length()-1; i++){
            String s1 = palin(i,i, s);
            
            String s2 ="";
            if (s.charAt(i)==s.charAt(i+1))
            s2 = palin(i,i+1,s);
            
           // System.out.println(s1+"   "+s2);
            len1 =s1.length(); 
            len2=s2.length();
            
            if (len1>temp){
                ans = s1 ;
                temp=len1;
            }
            if (len2>temp){
                ans = s2 ;
                temp =len2; 
            }
                
        }
        return ans ;
    }
    
    
    public static String palin(int i ,int j , String s){
       
        while(i-1>=0 && j+1<s.length() && s.charAt(i-1)==s.charAt(j+1) ){
                    i-- ; j++ ;
                    //System.out.println(i+"   "+j);
        }
        return s.substring(i,j+1);
    }
        
        
    
    
    
    
}
