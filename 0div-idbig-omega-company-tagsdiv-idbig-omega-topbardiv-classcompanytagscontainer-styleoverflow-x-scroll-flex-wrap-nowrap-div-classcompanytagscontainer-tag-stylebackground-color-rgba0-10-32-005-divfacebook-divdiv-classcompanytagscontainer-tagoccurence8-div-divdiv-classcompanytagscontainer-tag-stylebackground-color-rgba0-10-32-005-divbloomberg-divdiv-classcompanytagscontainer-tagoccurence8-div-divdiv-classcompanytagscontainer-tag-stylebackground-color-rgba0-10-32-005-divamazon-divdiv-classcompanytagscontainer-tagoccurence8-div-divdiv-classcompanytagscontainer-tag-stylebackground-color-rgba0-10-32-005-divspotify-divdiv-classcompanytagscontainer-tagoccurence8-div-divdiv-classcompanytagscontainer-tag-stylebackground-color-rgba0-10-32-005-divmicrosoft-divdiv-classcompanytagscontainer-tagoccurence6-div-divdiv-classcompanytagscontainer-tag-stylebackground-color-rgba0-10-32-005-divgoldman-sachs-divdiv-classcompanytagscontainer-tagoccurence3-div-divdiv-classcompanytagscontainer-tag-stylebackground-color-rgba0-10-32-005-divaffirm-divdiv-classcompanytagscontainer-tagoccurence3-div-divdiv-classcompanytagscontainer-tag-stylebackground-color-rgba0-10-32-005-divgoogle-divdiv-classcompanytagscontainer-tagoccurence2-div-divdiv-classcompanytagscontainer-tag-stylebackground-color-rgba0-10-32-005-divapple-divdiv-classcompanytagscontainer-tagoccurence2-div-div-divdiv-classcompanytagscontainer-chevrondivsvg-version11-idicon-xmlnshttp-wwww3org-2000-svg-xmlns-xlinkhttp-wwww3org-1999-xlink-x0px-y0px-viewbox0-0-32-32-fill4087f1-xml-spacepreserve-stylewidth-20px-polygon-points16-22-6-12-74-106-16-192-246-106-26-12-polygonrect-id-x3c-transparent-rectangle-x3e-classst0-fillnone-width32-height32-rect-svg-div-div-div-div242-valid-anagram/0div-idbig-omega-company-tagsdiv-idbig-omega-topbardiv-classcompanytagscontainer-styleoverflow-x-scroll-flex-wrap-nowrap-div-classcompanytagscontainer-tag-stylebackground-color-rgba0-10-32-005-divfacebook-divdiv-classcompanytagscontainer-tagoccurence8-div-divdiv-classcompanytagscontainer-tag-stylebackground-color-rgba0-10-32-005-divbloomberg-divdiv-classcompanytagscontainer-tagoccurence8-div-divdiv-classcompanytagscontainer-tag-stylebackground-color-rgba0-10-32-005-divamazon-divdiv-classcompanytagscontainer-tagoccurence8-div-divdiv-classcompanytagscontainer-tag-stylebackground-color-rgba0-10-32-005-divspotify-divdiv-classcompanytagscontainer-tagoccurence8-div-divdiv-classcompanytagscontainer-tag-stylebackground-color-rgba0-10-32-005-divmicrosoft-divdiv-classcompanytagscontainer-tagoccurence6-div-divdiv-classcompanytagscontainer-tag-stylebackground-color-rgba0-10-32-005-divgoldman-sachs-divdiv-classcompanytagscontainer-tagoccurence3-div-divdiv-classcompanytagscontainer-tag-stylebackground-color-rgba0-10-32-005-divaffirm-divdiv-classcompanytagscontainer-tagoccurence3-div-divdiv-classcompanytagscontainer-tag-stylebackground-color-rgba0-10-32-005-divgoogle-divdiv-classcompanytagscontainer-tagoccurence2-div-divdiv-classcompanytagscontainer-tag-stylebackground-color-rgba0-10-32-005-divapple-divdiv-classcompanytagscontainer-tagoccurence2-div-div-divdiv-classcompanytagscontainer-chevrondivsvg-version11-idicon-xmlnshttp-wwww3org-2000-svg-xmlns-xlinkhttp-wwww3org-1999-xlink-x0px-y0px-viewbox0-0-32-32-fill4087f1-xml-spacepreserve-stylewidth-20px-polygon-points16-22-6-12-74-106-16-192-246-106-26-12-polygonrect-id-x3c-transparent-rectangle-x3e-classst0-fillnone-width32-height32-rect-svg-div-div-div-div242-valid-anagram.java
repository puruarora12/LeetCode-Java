class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        int[] ch = new int[26];
        for(char i :s.toCharArray()) ch[i-'a']++;
        //int[] ch2 = new int[26];
        for(char i :t.toCharArray()) ch[i-'a']--;
       
        for(int i :ch) if(i!=0) return false;
        return true;
       
    }
}