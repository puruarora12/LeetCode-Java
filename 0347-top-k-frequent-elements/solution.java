class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<int[]> ls = new ArrayList<>();
        List<Integer> fre = new ArrayList<>();
        for(int i:nums){
            if(fre.contains(i)){
                int index = fre.indexOf(i);
                ls.get(index)[1]= ls.get(index)[1]+1;
            }else{
            fre.add(i);
            ls.add(new int[]{i,1});
            }
        }
        // System.out.println(fre);
        Collections.sort(ls, (a,b )-> b[1]-a[1]);
        int[] ans = new int[k];
        for(int i =0 ; i<k ; i++)ans[i]=ls.get(i)[0];
        return ans;

    }
}
