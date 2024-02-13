class Solution {
    public String firstPalindrome(String[] words) {
        for (String i : words) if(check(i))return i;
        return "";
    }
    
    public boolean check(String word){
        int left = 0 ; 
        int right = word.length()-1;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)) return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
    
}
