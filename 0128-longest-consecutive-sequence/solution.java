class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums.length == 0) return 0;

        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);  // O(N)

        int longestStreak = 0;

        for (int num : numSet) {
            // Start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {  // O(1) per lookup
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
