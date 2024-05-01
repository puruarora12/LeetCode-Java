class Solution {
    public String reversePrefix(String word, char ch) {
        String rev = "";
        int index =0;
        for(index =0 ; index<=word.length() ; index++){
            if(index==word.length()) break;
            if(word.charAt(index)==ch){
                rev = word.charAt(index)+""+rev;
                break;
            }else rev = word.charAt(index)+""+rev;
        }
        if(index == word.length()) return word;
        else return rev+word.substring(index+1 , word.length());
    }
}
