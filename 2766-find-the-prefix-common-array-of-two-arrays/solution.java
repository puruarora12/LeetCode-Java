class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int index = 0 ;
        int prev= 0;
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        int[] ans = new int[A.length];
        for(index = 0 ; index<A.length ; index++){
            
            if(setB.contains(A[index])) prev++;
            if(setA.contains(B[index]) || A[index]==B[index])prev++;
            // System.out.println("index "+ index+ " A[index] "+A[index]+" B[index] "+B[index] + " set A "+setA+" setB "+setB+ " prev "+prev);
            ans[index]=prev;
            setA.add(A[index]);
            setB.add(B[index]);
        }
        return ans;
    }
}
