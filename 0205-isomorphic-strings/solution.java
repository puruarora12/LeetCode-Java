class Solution {
    public boolean isIsomorphic(String s, String t) {
        char alpha[] = new char[257];
        boolean ar[] = new boolean[257];
        char longs[] = s.toCharArray();
        char shorts[] = t.toCharArray();
        for(int i  =0 ; i <longs.length ; i++){
            if (alpha[shorts[i]]==0 && ar[longs[i]]==false ) {
                alpha[shorts[i]] = longs[i]; 
                ar[longs[i]]=true;
                                                                                  }
            else if  (alpha[shorts[i]]!=longs[i]) return false;
         
        }
        return true;
    }
}
