class Solution {
    public char kthCharacter(int k) {
         StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            StringBuilder newWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char nextChar = (char) ((word.charAt(i) - 'a' + 1) % 26 + 'a');
                newWord.append(nextChar);
            }
            word.append(newWord);
        }
        return word.charAt(k - 1);
    }
    
}
