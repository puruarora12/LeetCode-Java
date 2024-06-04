class Solution {
    public int appendCharacters(String s, String t) {
        int indexs = 0;
        int indext = 0;
        while(indexs<s.length() && indext<t.length()){
            if(s.charAt(indexs)==t.charAt(indext)) indext++;
            indexs++;
        }
        //System.out.println("indexs "+indexs+"  indext "+indext);
        if(indext==t.length() && indext!=0)return 0;
        else return t.length()-indext;
    }
}
