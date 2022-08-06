class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int[] i: items1 ) map.put(i[0],i[1]);
        for(int[] i : items2) {
            if(map.containsKey(i[0])) map.put(i[0], map.get(i[0])+i[1]);
            else map.put(i[0], i[1]);
        }
        
        List<List<Integer>> ar= new ArrayList<>();
        for(Map.Entry<Integer,Integer> i: map.entrySet()) ar.add( List.of(i.getKey(), i.getValue()));
        return ar;
    }
}
