class Solution {
    public int countGoodNodes(int[][] edges) {
        int n = edges.length+1;
        
        Map<Integer, List<Integer>> tree = new HashMap<>();
        for (int[] edge : edges) {
            tree.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            tree.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }


       
        int[] subtreeSize = new int[n];
        boolean[] visited = new boolean[n];
        dfs(0, tree, subtreeSize, visited);

        int goodNodes = 0;
        for (int i = 0; i < n; i++) {
            if (isGood(i, tree, subtreeSize)) {
                goodNodes++;
            }
        }

        return goodNodes;


    }
    public static int dfs(int node, Map<Integer, List<Integer>> tree, int[] subtreeSize, boolean[] visited) {
        visited[node] = true;
        int size = 1;
        for (int neighbor : tree.get(node)) {
            if (!visited[neighbor]) {
                size += dfs(neighbor, tree, subtreeSize, visited);
            }
        }
        subtreeSize[node] = size;
        return size;
    }

      public static boolean isGood(int node, Map<Integer, List<Integer>> tree, int[] subtreeSize) {
        Set<Integer> sizes = new HashSet<>();
        for (int neighbor : tree.get(node)) {
            if (subtreeSize[neighbor] < subtreeSize[node]) {
                sizes.add(subtreeSize[neighbor]);
            }
        }
        return sizes.size() <= 1;
    }


}
