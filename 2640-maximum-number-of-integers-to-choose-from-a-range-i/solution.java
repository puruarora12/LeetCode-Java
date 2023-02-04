class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
       Set<Integer> bannedSet = new HashSet<>();
        for (int num : banned) {
            bannedSet.add(num);
        }
        
        int[] possibleChoices = new int[n];
        int k = 0;
        for (int i = 1; i <= n; i++) {
            if (!bannedSet.contains(i)) {
                possibleChoices[k++] = i;
            }
        }
        
        int choices = 0;
        for (int i = 0; i < k; i++) {
            if (possibleChoices[i] > maxSum) {
                break;
            }
            choices++;
            maxSum -= possibleChoices[i];
        }
        
        return choices;
    }
}
