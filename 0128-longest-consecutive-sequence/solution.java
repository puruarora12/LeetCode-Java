class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int i :nums)set.add(i);
        int max =0;
        for(int i :set){
            int len =1;
            int num = i;
            if(!set.contains(num+1)){
                while(set.contains(--num))len++;
            }
            max =Math.max(max, len);
        }
        return max;



    }
}
