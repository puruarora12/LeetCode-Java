class Solution {
    public boolean isIsomorphic(String s, String t) {
        char alpha[] = new char[257];
        boolean ar[] = new boolean[257];
        String longs = s;
        String shorts = t;
        for(int i  =0 ; i <longs.length() ; i++){
            if (alpha[shorts.charAt(i)]==0 && ar[longs.charAt(i)]==false ) {
                alpha[shorts.charAt(i)] = longs.charAt(i); 
                ar[longs.charAt(i)]=true;
                                                                                  }
            else if  (alpha[shorts.charAt(i)]!=longs.charAt(i)) return false;
         
        }
        return true;
    }
}
