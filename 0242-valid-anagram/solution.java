class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ss = new int[26];
        int[] tt = new int[26];
        Arrays.fill(ss,0);
        Arrays.fill(tt,0);
        for(char i:s.toCharArray()) ss[i-'a']++;
        for(char i:t.toCharArray()) tt[i-'a']++;
        return Arrays.toString(ss).equals(Arrays.toString(tt)) ? true:false;

    }
}
