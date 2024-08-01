class Solution {
    public int longestConsecutive(int[] nums) {
        TreeMap<Integer, Integer> set = new TreeMap<>();
        for(int i: nums){
            if(!set.containsKey(i))set.put(i , 0);
        }
        int l = 1 ;
        int max = 0;
        ArrayList<Integer> ar = new ArrayList<>(set.keySet());
        if(ar.size()==0)return 0;
        int el = ar.get(0);
        // System.out.println("element is "+ar.get(0));
        for(int i = 1 ; i<ar.size() ; i++){
            // System.out.println("element is "+ar.get(i)+" el is "+el);
            if(ar.get(i)==(el+1)){
                el++;
                l++;
            }else{
                
                el =ar.get(i);
                max = Math.max(l , max);
                l=1;
            }
        }
        max = Math.max(l, max);
        return max;
    }
}
