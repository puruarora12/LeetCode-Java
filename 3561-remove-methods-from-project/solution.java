class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
         List<List<Integer>> d = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            d.add(new ArrayList<>());
        }
        for (int[] e : invocations) {
            d.get(e[0]).add(e[1]);
        }

        Set<Integer> f = new HashSet<>();
        dfs(d, k, f);

        for (int g = 0; g < n; g++) {
            if (!f.contains(g)) {
                for (int h : d.get(g)) {
                    if (f.contains(h)) {
                        List<Integer> i = new ArrayList<>();
                        for (int j = 0; j < n; j++) {
                            i.add(j);
                        }
                        return i;
                    }
                }
            }
        }

        List<Integer> z = new ArrayList<>();
        for (int l = 0; l < n; l++) {
            if (!f.contains(l)) {
                z.add(l);
            }
        }

        return z;
    }

    private static void dfs(List<List<Integer>> m, int n, Set<Integer> o) {
        if (o.contains(n)) {
            return;
        }
        o.add(n);
        for (int p : m.get(n)) {
            dfs(m, p, o);
        }
    }
}
