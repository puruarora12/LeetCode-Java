class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        ArrayList<Character> ar = new ArrayList<>();
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i = 0 ; i<s.length() ; i++ ){
           if(map.containsKey(s.charAt(i))){
                s=s.substring(0,i)+map.get(s.charAt(i)) +s.substring(i+1 , s.length())  ;
           } 
            else if (ar.contains(t.charAt(i))) return false;
            else  {
                map.put(s.charAt(i) , t.charAt(i));
                 s=s.substring(0,i)+map.get(s.charAt(i))+s.substring(i+1 , s.length())  ;
                ar.add(t.charAt(i));
            }  
        } 
    return s.equals(t) ? true: false;
    }
}

