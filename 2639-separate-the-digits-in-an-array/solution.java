class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for (int i:nums){
            for(int z = 0 ; z<(""+i).length() ; z++){
                l.add(Integer.parseInt(""+(""+i).charAt(z)));
            }
        
        }
        int[] arr = l.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
