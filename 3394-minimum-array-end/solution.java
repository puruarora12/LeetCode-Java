class Solution {
    public long minEnd(int n, int x) {
      long result = x;
        long mask = 1;
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < 63; i++) {
            if ((result >> i & mask ^ mask) != 0) {
                indices.add(i);
            }
        }

        int size = indices.size();
        for (long i = 0; i < (mask << size); i++) {
            if (--n == 0) {
                for (int j = 0; j < 63; j++) {
                    if ((i >> j & mask) != 0) {
                        result |= mask << indices.get(j);
                    }
                }
                return result;
            }
        }

        return result;
    }

}
