class Solution {
    public String longestPalindrome(String s) {
        if (s.length()==1)
            return s;
        if (s.length()==2){
            if(s.charAt(0)==s.charAt(1))
                return s;
            else return ""+s.charAt(0);
            
        }
        
        //boolean b=false;
        String ans =""+s.charAt(0) ; 
        for (int i= 0  ; i<s.length(); i++){
            for(int j = s.length()-1 ; j>i ; j--){
                boolean b=false;
                String sub =s.substring(i,j+1);
                
                if (s.charAt(i)==s.charAt(j) && s.charAt(i+1)==s.charAt(j-1) && sub.length()>ans.length())
                     b = checkp(sub);
                
                  if (b && sub.length()>ans.length()){
                     ans =sub;
                 
            }
                        }
        }
   return ans;
    }
    
    
    
    public static boolean checkp(String s){
        
        for(int i = 0, j=s.length()-1 ; i<=(s.length()/2)  ; i++ , j--)
            if (s.charAt(i)!= s.charAt(j))
                return false;
   
    return true;
}
}
