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
            if(map.containsKey(svalue)){
                 
                ans.get(map.get(svalue)).add(strs[i]);
               
            }else{
                List<String> words = new ArrayList<>();
                words.add(strs[i]);
                ans.add(words);
                map.put(svalue, index);
                index++; 
              
            }
            
            
          
        }  
        return ans;
    }
    
    
}
