class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();
        for(String s: strs){
            char[] chrs = s.toCharArray();
            Arrays.sort(chrs);
            String word = new String(chrs);
            map.putIfAbsent(word, new ArrayList<String>() );
            map.get(word).add(s);
            
        }
       
        return new ArrayList<>(map.values());
    }
}
