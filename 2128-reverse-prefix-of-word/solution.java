class Solution {
    public String reversePrefix(String word, char ch) {
        String rev = "";
        int index =0;
        StringBuilder str = new StringBuilder();
        for(index =0 ; index<=word.length() ; index++){
            if(index==word.length()) break;
            if(word.charAt(index)==ch)
                break;
           
        }
        if(index == word.length()) return word;
        str.append(new StringBuilder(word.substring(0, index+1)).reverse());
        str.append(word.substring(index+1, word.length()));
        return str.toString();
    }
}
