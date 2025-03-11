class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String s: strs){
            char[] chrs = s.toCharArray();
            Arrays.sort(chrs);
            String word = new String(chrs);
            if(!map.containsKey(word)){
                List<String> ls = new ArrayList<>();
                ls.add(s);
                map.put(word,ls);
                ans.add(ls);

            }else
            map.get(word).add(s);
            
        }
       
        return ans;
    }
}
