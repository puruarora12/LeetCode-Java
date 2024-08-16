class Solution {
    public int minimumOperations(int[] nums) {
        int sum =0;
        for(int i:nums) sum+=Math.min(3-i%3, i%3);
        return sum;
    }
}
