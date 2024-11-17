class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1]; 
        for (int[] query : queries) {
            int li = query[0];
            int ri = query[1];

            
            diff[li]--;
           if (ri + 1 < n) {
                diff[ri + 1]++;
            }
        }

        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];
            nums[i] += curr; if (nums[i] < 0) {
                nums[i] = 0;
            }
        }

        for (int num : nums) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}
