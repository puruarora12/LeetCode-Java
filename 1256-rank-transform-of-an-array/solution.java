class Solution {

    public int[] arrayRankTransform(int[] arr) {

        int[] ar = Arrays.copyOf(arr,arr.length);
        Arrays.sort(ar);
        HashMap<Integer, Integer> map = new HashMap<>();
        int index =1;
       
        for(int i :ar){
            if(!map.containsKey(i)){
                map.put(i, index);
                index++;
            }
        }
        int[] ans = new int[arr.length];
        for(int i =0 ; i<arr.length ; i++) ans[i]=map.get(arr[i]);

        return ans;

    }

}
