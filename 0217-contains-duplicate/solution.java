class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int i:nums) {if(s.contains(i)) return true; else s.add(i); }
        return false;
     }
}
