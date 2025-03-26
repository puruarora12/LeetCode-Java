class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 , right = 0 , len =0;
        if(s.length()<2)return s.length();
        Set<Character> set = new HashSet<>();
        while(right<s.length()){
            char curr = s.charAt(right);

            if(set.contains(curr)){
                // System.out.println(" curr is  "+curr+"   len   "+len+ " right  "+right+"   "+left);
                len = Math.max(right-left,len);
                while(s.charAt(left)!=curr){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;                
            }
            set.add(curr);
            right++;

        }
        len = Math.max(len, right-left);
        return len;
    }
}
