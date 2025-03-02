class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return helper(s, wordDict, new HashMap<String, List<String>>());
    }

    public static List<String> helper(String s , List<String> wordDict, HashMap<String, List<String>> map){
        if( map.containsKey(s) ) return map.get(s);
        List<String> ans = new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        } 
        
        for(String word:wordDict){
            if(s.startsWith(word)){
                List<String> parts = helper(s.substring(word.length(),s.length()) , wordDict, map);
                    for(String part:parts){
                        ans.add(word + (part.isEmpty() ? "" :" ")+part);
                }
            }
        }
        map.put(s, ans);
        return ans;
    }
}
