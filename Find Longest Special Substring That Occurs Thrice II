class Solution {
    public int maximumLength(String s) {
        int[] chars = new int[26];
       
        for(int i = 0; i<s.length(); i++){
            chars[s.charAt(i)-'a']++;
           
        }
        
        int[] temp = chars;
        Arrays.sort(temp);
        if(temp[25]<3) return -1;
        
        
        int len =0 ;
        ArrayList<List<Integer>> ls = new ArrayList<>();

        for (int i = 0; i < 26; i++) ls.add(new ArrayList<>());
        

        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                j++;
            }
            ls.get(s.charAt(i) - 'a').add(j - i);
            i = j - 1;
        }

             for (int i = 0 ; i<ls.size() ; i++) {
                List<Integer> l = ls.get(i);
                if (l.isEmpty()) continue;  
                Collections.sort(l);   
                len = Math.max(len, l.get(l.size() - 1) - 2);  
                if (l.size() > 1) {  
                    len = Math.max(len, Math.min(l.get(l.size() - 1) - 1, l.get(l.size() - 2)));  
                }  
                if (l.size() > 2) {  
                    len = Math.max(len, l.get(l.size() - 3));  
            }  
        }  
 
        return len==0?-1: len;
        
        
        
    }
}
