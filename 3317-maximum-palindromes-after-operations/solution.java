class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        Map<Character, Integer> charFreq = new HashMap<>();
        List<Integer> halfPairs = new ArrayList<>();
        
        for (String word : words) {
            halfPairs.add(word.length() /  2);
            for (char c : word.toCharArray()) {
                charFreq.put(c, charFreq.getOrDefault(c,  0) +  1);
            }
        }
        
        int totalHalfPairs =  0;
        for (int freq : charFreq.values()) {
            totalHalfPairs += freq /  2;
        }
        
        Collections.sort(halfPairs);
        int wordIndex =  0;
        for (int halfPair : halfPairs) {
            totalHalfPairs -= halfPair;
            if (totalHalfPairs <  0) {
                return wordIndex;
            } else {
                wordIndex++;
            }
        }
        
        return halfPairs.size();
    }
}
