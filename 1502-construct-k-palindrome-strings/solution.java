class Solution {
    public boolean canConstruct(String s, int k) {
        if(k==s.length()) return true;
        if(k>s.length())return false;
        int[] chars = new int[26];

        for( char c: s.toCharArray() ){
            chars[c-'a']++;
            chars[c-'a']%=2;
        }
        int singleWords =0 ;
        for(int i =0; i<26 ; i++){
                singleWords+=chars[i];
        }
        if (singleWords>k) return false;
        else return true;
    }
}
