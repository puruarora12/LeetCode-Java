class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word = strs[0];
        for(int  i =1 ; i<strs.length ; i++){
            int x = 0 ;
            while(x<word.length() && x<strs[i].length() && word.charAt(x)==strs[i].charAt(x))x++ ;
            word = word.substring(0,x);
        }
        return word;
    }
}
