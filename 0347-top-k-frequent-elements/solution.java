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
       
        
        
        
        
        // for(int i :map.keySet())System.out.println("map key "+i+" map value "+map.get(i));
        // System.out.println();
        
        for(int i: map.keySet()){
            // System.out.println(i);
            ArrayList<Integer> ar = new ArrayList<>();
            if(mmap.containsKey(map.get(i))){
                ar= mmap.get(map.get(i));
                // System.out.println(i+"   "+map.get(i));
                // System.out.println(ar);
                
            }
            ar.add(i);
            mmap.put(map.get(i),ar);
            // System.out.println("map i mmap i "+map.get(i)+"     "+mmap.get(map.get(i)));
            // System.out.println(mmap.getOrDefault(map.get(i) , ar));
            // mmap.put(map.get(i),  mmap.getOrDefault(map.get(i) , ar).add(i) );
        }
        
        
        // for(int i :mmap.keySet())System.out.println("mmap key "+i+" mmap value "+mmap.get(i));
        // System.out.println();
        int ans[] = new int[k];
        // String a = "";
        ArrayList<Integer> num = new ArrayList<>();
        for(int i :mmap.keySet()){
            for(int index = 0 ; index<mmap.get(i).size() ; index++){
                // a = mmap.get(i).get(index)+"."+a;
                num.add(mmap.get(i).get(index));
            }
        }
        // a=a.substring(0, a.length()-1);
        // System.out.println(a);
        // String aa[] = a.split(".");
        // for(String i : aa)System.out.println(i);
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
