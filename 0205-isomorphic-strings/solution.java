class Solution {
    public boolean isIsomorphic(String s, String t) {
        char alpha[] = new char[257];
        boolean ar[] = new boolean[257];
        char ars[] = s.toCharArray();
        char art[] = t.toCharArray();
        
        for(int i = 0 ; i<ars.length ; i++){
             if(alpha[art[i]]==0 && ar[ars[i]]==false) {
                 alpha[art[i]]=ars[i];
                 ar[ars[i]]=true;
             }else if (alpha[art[i]]!=ars[i]) return false;
        }
        return true;
    }
}
