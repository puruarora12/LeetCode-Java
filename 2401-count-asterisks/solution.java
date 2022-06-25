class Solution {
    public int countAsterisks(String s) {
        int len = s.length();
        boolean left =false;
        boolean right = true;
        int count = 0;
        for(int i =0 ; i<len ; i++){
            if (s.charAt(i)=='*' && left==false && right ==true) count++; 
            else if(s.charAt(i)=='|' && left==false) left = true;
            else if(s.charAt(i)=='|' && left==true ) left = false;
            else continue;
        }
        return count;
    }
}
