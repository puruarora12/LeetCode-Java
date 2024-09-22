class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 0;
        long right = (long) max(workerTimes) * mountainHeight * (mountainHeight + 1) / 2;

        while (left < right) {
            long mid = left + (right - left) / 2;
            if (canReduceInTime(mid, mountainHeight, workerTimes)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean canReduceInTime(long time, int mountainHeight, int[] workerTimes) {
        long totalReduction = 0;
        for (int wt : workerTimes) {
            long maxHeight = 0;
            while ((maxHeight + 1) * (maxHeight + 2) / 2 * wt <= time) {
                maxHeight++;
            }
            totalReduction += maxHeight;
            if (totalReduction >= mountainHeight) {
                return true;
            }
        }
        return totalReduction >= mountainHeight;
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
