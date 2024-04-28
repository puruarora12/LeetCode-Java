class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
   Arrays.sort(nums1);
        Arrays.sort(nums2);
        Map<Integer, Integer> countX = new HashMap<>();
        int minPossibleX = Integer.MAX_VALUE;

        // Calculate potential x values based on every combination of nums1 and nums2 elements
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int x = nums2[j] - nums1[i];
                countX.put(x, countX.getOrDefault(x, 0) + 1);
            }
        }

        // Check each x value if it can lead to a successful transformation minus any two elements
        for (int x : countX.keySet()) {
            int[] transformed = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                transformed[i] = nums1[i] + x;
            }
            Arrays.sort(transformed);

            if (canMatchMinusTwo(transformed, nums2)) {
                minPossibleX = Math.min(minPossibleX, x);
            }
        }
        return minPossibleX;
    }

    private static boolean canMatchMinusTwo(int[] transformed, int[] nums2) {
        int i = 0, j = 0, skip = 2; // We can afford to skip 2 mismatches
        while (i < transformed.length && j < nums2.length) {
            if (transformed[i] == nums2[j]) {
                i++;
                j++;
            } else {
                i++;
                skip--;
                if (skip < 0) {
                    return false;
                }
            }
        }

        return j == nums2.length && (i - j) <= 2; // Remaining elements in transformed must not exceed two
    }


}
