class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i[]:nums1)map.put(i[0] , map.getOrDefault(i[0],i[1]));
        for(int i[]:nums2)map.put(i[0] ,  map.getOrDefault(i[0],0)+i[1]  );
        int[][] ans = new int[map.keySet().size()][2];
        int index =0 ;
        for(int i:map.keySet()){
            ans[index][0]=i;
            ans[index][1]=map.get(i);
            index++;
        }
        return ans;
    }
}
