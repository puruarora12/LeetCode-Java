class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ss = new int[26];
        // int[] tt = new int[26];
        Arrays.fill(ss,0);
        // Arrays.fill(tt,0);
        for(char i:s.toCharArray()) ss[i-'a']++;
        for(char i:t.toCharArray()) ss[i-'a']--;
        Arrays.sort(ss);
        if(ss[25]==0 && ss[0]==0) return true;
        return false;
        

    }
}
