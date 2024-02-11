public class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        for (int i =  0; i < nums.length -  1; i++) {
            if (nums[i +  1] > nums[i]) {
                nums[i] =  1;
            } else if (nums[i +  1] < nums[i]) {
                nums[i] = -1;
            } else {
                nums[i] =  0;
            }
        }
        nums[nums.length -  1] =  2;

        int n = nums.length;
        int m = pattern.length;

        int[] lps = new int[m];
        int len =  0;

        lps[0] =  0;

        int i =  1;
        while (i < m) {
            if (pattern[i] == pattern[len]) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len !=  0) {
                    len = lps[len -  1];
                } else {
                    lps[i] =  0;
                    i++;
                }
            }
        }

        int ans =  0;

        i =  0;
        int j =  0;
        while ((n - i) >= (m - j)) {
            if (pattern[j] == nums[i]) {
                j++;
                i++;
            }

            if (j == m) {
                ans++;
                j = lps[j -  1];
            } else if (i < n && pattern[j] != nums[i]) {
                if (j !=  0) {
                    j = lps[j -  1];
                } else {
                    i = i +  1;
                }
            }
        }
        return ans;
    }
}

