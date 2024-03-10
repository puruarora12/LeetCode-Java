class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int apples = 0;
        for (int i: apple) apples +=i;
        Arrays.sort(capacity);
        int index = capacity.length -1;
        while(apples>0) { apples-=capacity[index]; index--;}
        return capacity.length - index-1;
    }
}
