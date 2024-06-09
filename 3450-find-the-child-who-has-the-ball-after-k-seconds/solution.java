class Solution {
    public int numberOfChild(int n, int k) {
        int sec = k/(n-1);
        int pos =k%(n-1);
        //System.out.println(pos+"  "+sec);
        if(sec%2==0) return pos ;
        else return n-pos-1;
    }
}
