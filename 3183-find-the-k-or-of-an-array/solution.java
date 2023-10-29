class Solution {
    public int findKOr(int[] nums, int k) {
        int maxNum = 0;
    for (int num : nums) {
        maxNum = Math.max(maxNum, num);
    }
    
    int bitLength = (maxNum > 0) ? (int) (Math.log(maxNum) / Math.log(2)) + 1 : 1;
    int[] countBits = new int[bitLength];

    for (int num : nums) {
        for (int i = 0; i < bitLength; i++) {
            if (((num >> i) & 1) == 1) {
                countBits[i]++;
            }
        }
    }

    int kOr = 0;

    for (int i = 0; i < bitLength; i++) {
        if (countBits[i] >= k) {
            kOr |= (1 << i);
        }
    }
        return kOr;
    }
}
