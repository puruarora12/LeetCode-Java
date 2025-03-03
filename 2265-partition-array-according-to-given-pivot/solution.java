class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small =new ArrayList<>();
        List<Integer> pivots =new ArrayList<>();
        List<Integer> bigs =new ArrayList<>();

        for(int i:nums){
            if(i==pivot)pivots.add(i);
            else if(i<pivot)small.add(i);
            else bigs.add(i);
        }

        int ans[] = new int[small.size()+pivots.size()+bigs.size()];
        int index =0 ;
        for(int i:small)ans[index++]=i;
        for(int i:pivots)ans[index++]=i;
        for(int i:bigs)ans[index++]=i;
        return ans;
    }
}
