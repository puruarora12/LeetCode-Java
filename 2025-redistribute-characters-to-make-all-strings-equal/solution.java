class Solution {
    public boolean makeEqual(String[] words) {
        int[] chars = new int[26];
        for (int i = 0 ;i<words.length ; i++){
            for (int j =0; j<words[i].length() ; j++){
                chars[words[i].charAt(j)-'a']++;
            }
        }
        for(int i:chars){
            if(i%words.length!=0) return false;
        }
        return true;
    }
}
