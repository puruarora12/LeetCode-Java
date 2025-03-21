class Solution {
    public int maxChunksToSorted(int[] arr) {
        int runningSum =0 ;
        int expectedSum=0;
        int chunks=0;
        for(int i =0 ; i<arr.length; i++){
            runningSum+=arr[i];
            expectedSum+=i;
            if(expectedSum==runningSum)chunks++;
        }
        return chunks;
    }
}
