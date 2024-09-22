class Solution {
    public long validSubstringCount(String w1, String w2) {
        int[] tCount = new int[26];
        int[] wCount = new int[26];

        for (char c : w2.toCharArray()) {
            tCount[c - 'a']++;
        }

        int i = 0;
        int needed = w2.length();
        long result = 0;

        for (int j = 0; j < w1.length(); j++) {
            char c = w1.charAt(j);

            if (tCount[c - 'a'] > 0) {
                if (wCount[c - 'a'] < tCount[c - 'a']) {
                    needed--;
                }
            }

            wCount[c - 'a']++;

            while (needed == 0) {
                result += w1.length() - j;

                char startChar = w1.charAt(i);
                wCount[startChar - 'a']--;

                if (tCount[startChar - 'a'] > 0 && wCount[startChar - 'a'] < tCount[startChar - 'a']) {
                    needed++;
                }

                i++;
            }
        }
        return result;
    }
}

