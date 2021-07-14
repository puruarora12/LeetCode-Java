class Solution {
    public String customSortString(String order, String str) {
        int alpha[] = new int[26];
        for(int i = 0 ; i <str.length(); i++) alpha[str.charAt(i)-97]++;
        String ans = "";
        
        for(int i = 0 ; i<order.length(); i++){
            ans += (""+order.charAt(i)).repeat(alpha[order.charAt(i)-97]);
            alpha[order.charAt(i)-97] = 0 ;
        }
        for(int i = 0 ; i<26 ; i++){
           ans += (""+(char)(i+97)).repeat(alpha[i]);
        }
        
        return ans;
    }
}
