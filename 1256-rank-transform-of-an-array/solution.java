class Solution {

    public int[] arrayRankTransform(int[] arr) {

//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i :arr){
//             map.put(i, map.getOrDefault(i, 0)+1);
//         }
        
        
        
        
        // ArrayList<Integer> ar = new ArrayList<>();
        // for(int i:arr)if(!ar.contains(i))ar.add(i);
        // Collections.sort(ar);
        int[] ar = Arrays.copyOf(arr,arr.length);
        Arrays.sort(ar);
        HashMap<Integer, Integer> map = new HashMap<>();
        int index =1;
        // int prev =Integer.MAX_VALUE;
        for(int i :ar){
            if(!map.containsKey(i)){
                map.put(i, index);
                index++;
            }
        }
        int[] ans = new int[arr.length];
        
         for(int i =0 ; i<arr.length ; i++)
            //ans[i]=map.get(arr[i]);
            ans[i]=map.get(arr[i]);

        return ans;

    }

}
