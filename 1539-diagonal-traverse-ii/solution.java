class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        int count =0 ;
        for(int i = nums.size()-1 ; i>=0 ; i--){
            for(int j = 0 ; j<nums.get(i).size() ; j++){
                List<Integer> ls = new ArrayList<>();
                map.putIfAbsent(i+j, ls);
                map.get(i+j).add(nums.get(i).get(j));
                count++;
            }
        }

        int ans[] = new int[count];
        int index =0 ;
        for(int i :map.keySet()){
            for(int x:map.get(i)){
                    ans[index++]=x;
            }
        }
        return ans;
    }
}
