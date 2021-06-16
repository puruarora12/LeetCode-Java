class Solution {
    public void reverseString(char[] s) {
        int temp = 0 ; 
        char tem = 'a';
        for (int i = s.length-1 ; i>=s.length/2 ; i--){
            tem=s[i];
            s[i]=s[temp];
            s[temp]=tem;
            temp++;
        }
            //System.out.print(s[i]);
    }
}
