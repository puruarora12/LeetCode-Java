class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , Integer> map = new HashMap<>();
        Integer index = 0;
        List<List<String>> ans = new ArrayList<>();
        
        for (int i = 0 ; i<strs.length ; i++ ){
          //  System.out.println(strs[i]);
           
            String chars = strs[i].chars()
      .sorted()
      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      .toString();
           // System.out.println(chars);
             //String pos = StringcontainsKey(map, strs[i]);
            if(map.containsKey(chars)){
                //System.out.println(" int map contains "+chars);
               
                
                ans.get(map.get(chars)).add(strs[i]);
                //words.add(strs[i]);
                //map.put(pos , words);
                
            }else{
                List<String> words = new ArrayList<>();
                words.add(strs[i]);
                ans.add(words);
                String word = strs[i].chars()
      .sorted()
      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      .toString();
                map.put(word, index);
                index++; 
              //  System.out.println("the index is "+index);
            }
            
            
          
        }  
       // for(int[] i : map.keySet())ans.add(map.get(i)) ; 
        
        return ans;
    }
    
    
}
