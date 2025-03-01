class Solution {
    static int lastWordLength;
    static HashMap<String, Boolean> data;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        data = new HashMap<>();
         for(String word: words){
            data.put(word, true);
        }
       
        List<String> ans = new ArrayList<String>();
        for(String word :words){
           data.remove(word);
            if(check(word, word))ans.add(word);
            data.put(word,true);
            //  System.out.println("after word "+word+"  "+data);
        }



        return ans;
    }
    public static boolean check(String word, String originalWord){
       
        if(data.containsKey(word))return data.get(word);
        if(word.length()==1) return false;

        for(int i = 0 ; i<word.length() ; i++){
            String fsub = word.substring(0,i);
            String bsub = word.substring(i,word.length());
            // System.out.println(fsub+ "  "+bsub);

            if(  ( 
                ( data.containsKey(fsub) && data.containsKey(bsub) &&
                data.get(fsub) && data.get(bsub) )  ||
                 (check(fsub, originalWord) && check(bsub, originalWord) ) 
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
