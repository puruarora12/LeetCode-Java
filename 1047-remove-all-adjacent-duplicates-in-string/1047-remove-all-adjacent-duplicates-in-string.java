class Solution {
    public String removeDuplicates(String s) {
        int left  =0 ; int right =1 ;
        while(left<s.length()-1 && right<s.length()){
            if(s.charAt(left)==s.charAt(right)) {
                s=s.substring(0,left)+s.substring(right+1 ,s.length());
                left-- ;
                if(left<0) left=0;
                right=left+1;
            }
            else{
                left++ ;
                right++;
            }
        }
        return s;
        
    }
}