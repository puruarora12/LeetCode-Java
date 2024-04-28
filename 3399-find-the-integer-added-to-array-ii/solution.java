class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Map<Integer, Integer> map = new HashMap<>();
        int minnum = Integer.MAX_VALUE;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int x = nums2[j] - nums1[i];
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        for (int x : map.keySet()) {
            int[] nar = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                nar[i] = nums1[i] + x;
            }
            Arrays.sort(nar);
            if (canMatchMinusTwo(nar, nums2)) {
                minnum = Math.min(minnum, x);
            }
        }
        return minnum;
    }

    private static boolean canMatchMinusTwo(int[] nar, int[] nums2) {
        int i = 0, j = 0, skip = 2; 
        while (i < nar.length && j < nums2.length) {
            if (nar[i] == nums2[j]) {
                i++; j++;
            } else {
                i++;skip--;
                if (skip < 0) {
                    return false;
                }
            }
        }

        return j == nums2.length && (i - j) <= 2;
    }


}
