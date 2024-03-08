class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[] = new int[101];
        for(int i : nums) freq[i]++;
        Arrays.sort(freq);
        int index = 0;
        //while(freq[index]==0) index++;
        int max = 1;
        int ans = 0;
        for(int i = 99 ; i>=0 ; i--){
            if(freq[i]==freq[i+1]) max++;
            else break;
        }
        
        return max*freq[100];
    }
}
