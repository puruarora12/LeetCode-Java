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
                //System.out.println("The len of sub is "+sub.length() + " the length of ans is "+ans.length());
                if (s.charAt(i)==s.charAt(j) && sub.length()>ans.length())
                     b = checkp(sub);
                
                  if (b && sub.length()>ans.length()){
                     ans =sub;
                 //System.out.println(ans);
                   // System.out.println("i is "+i+" and j is "+j);
            }
                        }
        }
   return ans;
    }
    
    
    
    public static boolean checkp(String s){
        //System.out.println(s);
        for(int i = 0, j=s.length()-1 ; i<=(s.length()/2)  ; i++ , j--)
            if (s.charAt(i)!= s.charAt(j))
                return false;
    //System.out.println("Returning True");
    return true;
}
}
