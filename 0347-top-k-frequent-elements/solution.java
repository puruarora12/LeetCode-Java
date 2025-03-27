class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i:nums)map.put(i, map.getOrDefault(i,0)+1);

        ArrayList<Integer>[] bucket= new ArrayList[nums.length+1];

        for(int i:map.keySet()){
            int freq = map.get(i);
            if(bucket[freq]==null)bucket[freq]=new ArrayList<>();

            bucket[freq].add(i);
        }
        int[] ans = new int[k];
        int index =0 ;
        for(int i=nums.length; i>=0 && index<k; i--){
                if(bucket[i]==null)continue;
                for(int x: bucket[i]){
                        if(index<k)ans[index++]=x;
                        else break;
                        
                }
        }
        return ans;
    }
}
