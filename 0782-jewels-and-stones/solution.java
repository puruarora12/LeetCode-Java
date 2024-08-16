class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char i: jewels.toCharArray()) set.add(i);
        for(char i:stones.toCharArray())if (set.contains(i)) count++;
        return count;
    }
}
