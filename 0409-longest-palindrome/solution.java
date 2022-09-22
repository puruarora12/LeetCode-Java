class Solution {
    public int longestPalindrome(String s) {
        char[] ar  = s.toCharArray();
        int[] freq = new int[59];
        for(char i:ar){
            freq[i-65]++;
        }
        Arrays.sort(freq);
        int length = 0 ;
        int i =0;
        boolean carry = false;
        for(i = 58 ; i>=0; i--){
            length+=freq[i];
            if(freq[i]%2!=0) { carry = true; length--; } 
            
        }
        return  carry ? length+1:length;
    }
}
