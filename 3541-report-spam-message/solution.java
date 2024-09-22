class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> set = new HashSet<>();
        for(String i: bannedWords)set.add(i);
        int count =0;
        for(String i :message) {
            if(set.contains(i))count++;
            if(count>=2) return true;
        
        }
        return false;
    }
}
