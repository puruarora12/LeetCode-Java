class Solution {
    public int hammingDistance(int x, int y) {
        String ans = Integer.toBinaryString(x^y);
        int count =0;
        for (int i =0 ; i<ans.length();i++){
            if (ans.charAt(i)=='1')
                count++;
        }
        //String a = Integer.toBinaryString(ans);
        //System.out.print(count);
        return count;
    }
}
