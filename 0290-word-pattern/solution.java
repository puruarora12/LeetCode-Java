class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character , String> map= new HashMap<>();
        HashSet<String> set= new HashSet<>();
        String[] words = s.split(" ");
        if(words.length!=pattern.length()) return false;
        for(int i =0 ; i<words.length ; i++){
            if(map.containsKey(pattern.charAt(i)) && map.get(pattern.charAt(i)).equals(words[i])) continue;
            else if(!set.contains(words[i]) && !map.containsKey(pattern.charAt(i))) { map.put(pattern.charAt(i) , words[i]); set.add(words[i]);}
            else return false;
        }
        return true;
    }
}
