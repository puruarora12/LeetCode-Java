class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] uniword = new int[26];
        Arrays.fill(uniword,0);
        for(String i :words2){
            int[] word = new int[26];
            for (char c : i.toCharArray())word[c-'a']++;
            for(int index =0 ; index<26;index++)
            uniword[index]= Math.max(uniword[index] , word[index]);
        }
        for(String word :words1){
            int[] freq = new int[26];
            boolean addword = true;
            for(char c : word.toCharArray())freq[c-'a']++;
            for(int index =0 ;index<26;index++){
                if(freq[index]<uniword[index]) addword=false;

            }
            if(addword)ans.add(word); 
        }
        return ans;
    }
}
