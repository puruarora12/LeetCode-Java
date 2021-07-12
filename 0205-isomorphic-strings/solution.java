class Solution {
    public boolean isIsomorphic(String s, String t) {
        char alpha[] = new char[257];
        boolean ar[] = new boolean[257];
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();
        
        for(int i = 0 ; i<ss.length ; i++){
            if(alpha[tt[i]]==0 && ar[ss[i]]==false){
                alpha[tt[i]]=ss[i];
                ar[ss[i]]=true;
            }else if (alpha[tt[i]]!=ss[i]) return false;
        }
        return true;
        
    }
}
