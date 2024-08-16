class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] indexes = new int[26];
        for(int i = 0 ; i <s.length()  ; i++){
            indexes[s.charAt(i)-'a']-=i;
            indexes[t.charAt(i)-'a']+=i;
        }
        int sum = 0 ; 
        for(int i:indexes) sum+=Math.abs(i);
        return sum;
    }
}
