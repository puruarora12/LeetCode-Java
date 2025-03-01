class Solution {
    static int lastWordLength;
    static HashMap<String, Boolean> data;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        // List<String> w = new ArrayList<>(Arrays.asList(words));
        HashMap<Integer, Set<String>> map = new HashMap<>();
        data = new HashMap<>();
         for(String word: words){
            int len = word.length();
            Set<String> s = map.getOrDefault(len, new HashSet<>());
            s.add(word);
            map.put(len, s);
        }
        // Collections.sort(w ,(a1,a2) -> Integer.compare(a1.length(), a2.length()));
        // Set<String> set=  new HashSet<>();
        // lastWordLength = w.get(0).length();
        List<String> ans = new ArrayList<String>();
        // System.out.println("map "+map);
        for(String word :words){
           
            if(check(word, map, word))ans.add(word);
            data.put(word,true);
            //  System.out.println("after word "+word+"  "+data);
            // set.add(word);
            // lastWordLength= word.length();
        }



        return ans;
    }
    public static boolean check(String word, HashMap<Integer, Set<String>> map, String originalWord){
        int len = word.length();
        // System.out.println("Recurse "+word+ " len "+len);
        if(data.containsKey(word))return data.get(word);
        if( map.containsKey(word.length()) && map.get(len).contains(word) && !word.equals(originalWord)) return true;
        if(word.length()==1) return false;

        for(int i = 0 ; i<word.length() ; i++){
            String fsub = word.substring(0,i);
            String bsub = word.substring(i,word.length());
            // System.out.println(fsub+ "  "+bsub);

            if(  ( 
                ( map.containsKey(fsub.length()) && map.containsKey(bsub.length()) &&map.get(fsub.length()).contains(fsub) && map.get(bsub.length()).contains(bsub) )  ||
                 (check(fsub, map, originalWord) && check(bsub, map, originalWord) ) 
            ) 
                ){
                    // System.out.println("Found "+word);
                    data.put(word,true);
                    return true;
                }
            
        }
        data.put(word,false);
        return false;
    }
}
