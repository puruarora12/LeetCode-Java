class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        boolean[] used = new boolean[m]; // Track used baskets
        int unplaced = 0;

        for (int fruit : fruits) {
            boolean placed = false;
            for (int j = 0; j < m; j++) {
                if (!used[j] && baskets[j] >= fruit) {
                    used[j] = true;
                    placed = true;
                    break;
                }
            }
            if (!placed) unplaced++;
        }

        return unplaced;
    }
}

