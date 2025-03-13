class Solution {
    public int numberOfSubstrings(String s) {
        int count =0 ; 
        int left = 0  ;
        char[] ch = s.toCharArray();
        int len = ch.length;
        int[] freq = new int[3];

        for(int right = 0 ; right<len ;right++){
            freq[ch[right]-'a']++;

            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count+=len-right;
                freq[ch[left]-'a']--;
                left++;
            }
        }
        return count;
    }
}
