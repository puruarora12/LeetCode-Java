class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length ;
        int max = Integer.MIN_VALUE;
        for(int e :arr) max = Math.max(max ,e);
        int freq[] = new int[max+1];
        
        for(int e:arr){
            freq[e]++;
            
        }
        Arrays.sort(freq);
        
        int i = max;
        int count = 0;
        while(n>arr.length/2){
            n-=freq[i];
            i--;
            count++;
        }
        return count;
        
    }
}
