class Solution {
    public boolean backspaceCompare(String s, String t) {
        String news = "";
        String newt = "";
            for(int z = 0 ; z<s.length(); z++){
                char i = s.charAt(z);
                if(i=='#' && news.length()==0) continue;
                else if (i!='#') news+=i;
                else news = news.substring(0 , news.length()-1);
            }
        
        for(int z = 0 ; z<t.length(); z++){
                char i = t.charAt(z);
                if(i=='#' && newt.length()==0) continue;
                else if (i!='#') newt+=i;
                else newt = newt.substring(0 , newt.length()-1);
            }
        
        return news.equals(newt) ?  true:false;
    }
}
