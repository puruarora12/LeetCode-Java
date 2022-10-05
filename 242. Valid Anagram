class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        
        for(char i: s.toCharArray()) freqS[i-97]++;
        for(char i: t.toCharArray()) freqT[i-97]++;
        
        for(int i = 0 ; i<26 ;i++) if(freqS[i]!=freqT[i]) return false;
        return true;
    }
}
