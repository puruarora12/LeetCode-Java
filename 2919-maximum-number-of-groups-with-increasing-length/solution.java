class Solution {
        public int maxIncreasingGroups(List<Integer> A) {
        Collections.sort(A);
        long total = 0, k = 0, n = A.size();
        for (int i = 0; i < n; i++) {
            total += A.get(i);
            if (total >= (k + 1) * (k + 2) / 2)
                k++;
        }
        return (int)k;
    }
}
