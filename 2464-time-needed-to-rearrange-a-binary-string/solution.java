class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int count = 0 ;
        int n = s.length()-1;
        StringBuilder st  =new StringBuilder(s);
        while(s.contains("01")){
            count++;
            for(int i  = 0 ; i<n ; i++){
                if(s.charAt(i)=='0' && s.charAt(i+1)=='1'){
                st.setCharAt(i,'1');
                st.setCharAt(i+1,'0');
                i++;
            }
        }
        s=st.toString();
        }
    return count;
    }
}
