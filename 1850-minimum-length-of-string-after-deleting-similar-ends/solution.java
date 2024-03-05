class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length()-1;
        
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                char a = s.charAt(left);
                while(left<s.length() && s.charAt(left)==a && left<=right)left++;
                while(right>=0 && s.charAt(right)==a && right>=left)right--;
                }else break;
        }
       return left>right?0:right-left+1;
    }
}
