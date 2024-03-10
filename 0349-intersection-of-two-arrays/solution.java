class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i :nums1)set.add(i);
        for(int i:nums2) if(set.contains(i)) {ar.add(i) ;set.remove(i);}
        
        return ar.stream().mapToInt(i -> i).toArray();
    }
}
