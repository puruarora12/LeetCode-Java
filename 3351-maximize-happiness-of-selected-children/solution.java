class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long decrease = 0;
        long happy = 0;
        int index = happiness.length-1;
        while(k-->0){
            happy+=Math.max(happiness[index]-decrease,0);
            index--;
            decrease++;
        }
        
        return happy;
    }
}
