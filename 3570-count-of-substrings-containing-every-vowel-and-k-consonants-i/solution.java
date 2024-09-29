class Solution {
    public int countOfSubstrings(String word, int k) {
        int count = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i < word.length(); i++) {
            int consonantCount = 0;
            Set<Character> foundVowels = new HashSet<>();
            for (int j = i; j < word.length(); j++) {
                char c = word.charAt(j);
                if (vowels.contains(c)) {
                    foundVowels.add(c);
                } else {
                    consonantCount++;
                }
                if (foundVowels.size() == 5 && consonantCount == k) {
                    count++;
                }
            }
        }
        return count;
}
}
