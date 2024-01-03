class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , Integer> map = new HashMap<>();
        Integer index = 0;
        List<List<String>> ans = new ArrayList<>();
        
        for (int i = 0 ; i<strs.length ; i++ ){
           char[] chars = new char[26];
           for(int j = 0 ; j<strs[i].length() ;j++ )
               chars[strs[i].charAt(j)-'a']++;
            String svalue = String.valueOf(chars);
            //System.out.println(svalue);
                     if(map.containsKey(String.valueOf(chars))){
                //System.out.println(" int map contains "+chars);
               
                
                ans.get(map.get(String.valueOf(chars))).add(strs[i]);
                //words.add(strs[i]);
                //map.put(pos , words);
                
            }else{
                List<String> words = new ArrayList<>();
                words.add(strs[i]);
                ans.add(words);
                map.put(String.valueOf(chars), index);
                index++; 
              //  System.out.println("the index is "+index);
            }
            
            
          
        }  
       // for(int[] i : map.keySet())ans.add(map.get(i)) ; 
        
        return ans;
    }
    
    
}
