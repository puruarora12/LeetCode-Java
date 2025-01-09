class Solution {
    public int prefixCount(String[] words, String pref) {
        int count= 0;
        for (String i: words){
            if(i.length()<pref.length()) continue;
            else if(i.substring(0, pref.length()).equals(pref))count++;
            else continue;

        }
        return count;
    }
}
