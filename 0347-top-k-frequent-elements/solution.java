class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,int[]>map = new HashMap<>();
        for(int i:nums){
            int[] value = map.getOrDefault(i,new int[2]);
            value[0]=i;
            value[1]+=1;
            map.put(i,value);
        }

        List<int[]> ls=new ArrayList<>(map.values());
        Collections.sort(ls, (a,b)->b[1]-a[1]);
        int[] ans = new int[k];
        for(int i =0 ; i<k ; i++)ans[i]=ls.get(i)[0];
        return ans;
    }
}
