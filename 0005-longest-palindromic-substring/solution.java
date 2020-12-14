class Solution {
    public String longestPalindrome(String s) {
        if (s.length()<1)
            return "";
            String ans = "";
            int start=0,end=0 ,m=0;
            for(int i =0 ; i<s.length() ; i++){
                int s1 = checkp(s,i,i);
                int s2 = checkp(s,i,i+1);
                
                 m = Math.max(s1 ,s2);
                System.out.println(i+" m is "+m);
                if (m>end-start){
                    start = i-(m-1)/2;
                    end  = i+(m/2);
                }
                
                
            }
        return s.substring(start, end +1);
        
    }
    
    public static int checkp(String s ,int start , int end){
        if (s==null || start>end ) return 0;
        
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return end -1 -start ;
    }
}
