class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] chars = new int[26];
        int max = Integer.MIN_VALUE;
        Arrays.fill(chars, -1);
        for(int i = 0 ; i <s.length() ;i++){
            if(chars[s.charAt(i)-'a']!=-1) max = Math.max(max , i - chars[s.charAt(i)-'a']);
            else chars[s.charAt(i)-'a']=i;
        }
        return max==Integer.MIN_VALUE? -1 :max-1 ; 
    }
}
