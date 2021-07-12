class Solution {
    public boolean isIsomorphic(String s, String t) {
        char alpha[] = new char[257];
        boolean ar[] = new boolean[257];
        Arrays.fill(ar , true);
        Arrays.fill(alpha,' ');
        String longs = s.length()>t.length() ? s : t;
        String shorts = s.length()<=t.length() ? s : t;
       // System.out.println("long is "+longs+"  shots is "+shorts);
        for(int i  =0 ; i <longs.length() ; i++){
            if (alpha[shorts.charAt(i)]==' ' && ar[longs.charAt(i)]==true ) {
                alpha[shorts.charAt(i)] = longs.charAt(i); 
                ar[longs.charAt(i)]=false;
                                                                                  }
            else if  (alpha[shorts.charAt(i)]!=longs.charAt(i)) return false;
            //else if  (ar[longs.charAt(i)-97]==false) return false;
            else continue;
        }
     //  for(int i = 0 ; i <26 ; i ++)
          // System.out.println(alpha[i]+"   "+i);
        return true;
    }
}
