class Solution {
    public String makeGood(String s) {
       
        while(!s.equals(remove(s)))
        s =remove(s);
        
        return s;
    }
    
    private String remove(String s){
         int i = 0;
        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)+32 || 32+s.charAt(i)==s.charAt(i+1)  ) 
                s= s.substring(0 , i)+s.substring( i+2 , s.length());
            else i++;
        }
        return s;
    }
}

//65 -A 
//97 -a
