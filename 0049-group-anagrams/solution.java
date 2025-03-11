class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();
        for(String s: strs){
            int[] chars = new int[26];
            for(char c:s.toCharArray())chars[c-'a']++;
            List<String> words = new ArrayList<>();
            String chrs = Arrays.toString(chars);
            words = map.getOrDefault(chrs, words);
            words.add(s);
            map.put(chrs, words);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String s:map.keySet()) ans.add(map.get(s));
        return ans;

    }
}
