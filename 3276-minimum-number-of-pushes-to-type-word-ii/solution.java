class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        Arrays.fill(freq,0);
        for(char i :word.toCharArray()){
            freq[i-'a']++;
        }
        int unique = 0 ;
        for(int i:freq) if(i!=0)unique++;
        // System.out.println(unique);
        if(unique<9) return word.length();
        Arrays.sort(freq);
        int sum = 0 ;
        for(int i =25 ; i>=2 ; i--){
            if(freq[i]==0) break;
            // System.out.println(freq[i]+"   i "+ i+ "    by9 "+ (((25-i)/8)+1));
            sum+=freq[i]*(((25-i)/8)+1);
        }
        sum+= (freq[1]+freq[0])*4;
        return sum;
    }
}
