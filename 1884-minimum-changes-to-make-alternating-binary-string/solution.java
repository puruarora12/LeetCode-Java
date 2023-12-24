class Solution {
    public int minOperations(String s) {
        int slen = s.length(); 
        int diff0 = 0;
               
        for(int i = 0;i<s.length() ; i++)
            if(s.charAt(i)-'0'!=i%2) diff0++;
        
        return Math.min(diff0 , slen-diff0);
    }
}
