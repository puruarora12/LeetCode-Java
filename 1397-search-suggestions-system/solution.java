class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> ans = new ArrayList<>();
        // List<String> matches = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        map.put(".", Arrays.asList(products));
        String word = ".";
        String tosearch = "";
        for (char  i : searchWord.toCharArray()){
            tosearch+=i;
            List<String> preMatches = map.get(word);
            List<String> matches = new ArrayList<>();
            for(String match : preMatches){
                if (match.startsWith(tosearch))
                    matches.add(match);
                
            }
            List<String> toadd = new ArrayList<>();
            for(int index =0 ; index<matches.size() && index<3 ; index++ )toadd.add(matches.get(index));
            ans.add(toadd);
            word+=i;
            map.put(word ,matches);

           
        }
        return ans;
    }
}
