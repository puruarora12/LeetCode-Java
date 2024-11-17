class Solution {
    public int countValidSelections(int[] nums) {
          int n = nums.length;
        int validCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (simulate(nums, i, 1)) 
                    validCount++;
                
                if (simulate(nums, i, -1)) 
                    validCount++;
                
            }
        }

        return validCount;
    }


    public static boolean simulate(int[] nums, int curr, int direction) {
        int[] numsCopy = Arrays.copyOf(nums, nums.length);

        while (curr >= 0 && curr < numsCopy.length) {
            if (numsCopy[curr] == 0) {
                curr += direction;
            } else {
                numsCopy[curr]--;
                direction = -direction;
                curr += direction;
            }
        }

        for (int num : numsCopy) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
  
    
}
