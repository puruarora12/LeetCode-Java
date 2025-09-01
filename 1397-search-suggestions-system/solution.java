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
            int index =0 ;
            for(String match : preMatches){
                if (match.startsWith(tosearch)){
                    matches.add(match);
                    index++;
                }
                if(index==3){
                    // System.out.println("added in main  here");
                     List<String> toadd = new ArrayList<>(matches);
                     ans.add(toadd);
                     index++;
                }
            }
             word+=i;
            map.put(word ,matches);
            // System.out.println(index);
            // System.out.println(word +  " matches : "+matches);
            if(index<3){
                // System.out.println("adding here in outside ");
                  List<String> toadd = new ArrayList<>(matches);
                     ans.add(toadd);
            }
            // List<String> toadd = new ArrayList<>();
            // for(int index =0 ; index<matches.size() && index<3 ; index++ )toadd.add(matches.get(index));
            // ans.add(toadd);
            // word+=i;
            // map.put(word ,matches);

           
        }
        return ans;
    }
}
