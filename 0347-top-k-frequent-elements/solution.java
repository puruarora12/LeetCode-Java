class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        TreeMap<Integer, ArrayList<Integer>> mmap = new TreeMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int freq =1 ;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i]==nums[i-1]) freq++;
            else{
                map.put(nums[i-1], freq);
                freq=1;
            }
        }
        map.put(nums[nums.length-1] ,freq);
       
        
        for(int i: map.keySet()){
            ArrayList<Integer> ar = new ArrayList<>();
            if(mmap.containsKey(map.get(i))){
                ar= mmap.get(map.get(i));
            
                
            }
            ar.add(i);
            mmap.put(map.get(i),ar);
          
        }
        
        
        int ans[] = new int[k];
        ArrayList<Integer> num = new ArrayList<>();
        for(int i :mmap.keySet()){
            for(int index = 0 ; index<mmap.get(i).size() ; index++){
                num.add(mmap.get(i).get(index));
            }
        }
        int index = 0 ;
        int pos = num.size()-1;
        while(k>0){
            ans[index] = num.get(pos);
            pos--;
            index++;
            k--;
        }
        
        return ans;
    }
}
