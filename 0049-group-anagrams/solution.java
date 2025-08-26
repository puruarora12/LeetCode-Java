class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String s: strs){
            int[] count = new int[26];
            for (char c :s.toCharArray()){
                count[c-'a']++;
            }
            // Arrays.sort(chrs);
            String word = Arrays.toString(count);
            if(map.containsKey(word)){
            map.get(word).add(s);
            }else{
                 List<String> ls = new ArrayList<>();
                ls.add(s);
                map.put(word,ls);
                ans.add(ls);
            }
            
        }
       
        return ans;
    }
}
