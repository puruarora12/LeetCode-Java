class Solution {
    public int findMaxK(int[] nums) {
        int max=-1;
        HashSet<Integer> set =new HashSet<>();
        for(int i :nums){
            if(set.contains((i*-1))) max =Math.max(max,Math.abs(i));
            else set.add(i);
        }
        return max;
    }
}
