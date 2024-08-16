class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(char i:n.toCharArray())max = Math.max(max , i-'0');
        return max;
    }
}
