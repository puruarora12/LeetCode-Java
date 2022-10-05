class Solution {
    public int firstUniqChar(String s) {
        int[] ar = new int[26];
        for(char i: s.toCharArray()) ar[i-97]++;
        for(char i: s.toCharArray()) if(ar[i-97]==1) return s.indexOf(i);
        return -1;
    }
}
