import java.util.*;

class Tuple {
    int first, second;

    public Tuple(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Tuple>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Convert 1-based indexing to 0-based indexing
        for (int[] time : times) {
            adj.get(time[0] - 1).add(new Tuple(time[1] - 1, time[2]));
        }

        // Priority queue for Dijkstra’s algorithm
        PriorityQueue<Tuple> q = new PriorityQueue<>(Comparator.comparingInt(a -> a.second));

        // Distance array, initialized with infinity (MAX_VALUE)
        int[] visitedtime = new int[n];
        Arrays.fill(visitedtime, Integer.MAX_VALUE);
        visitedtime[k - 1] = 0;  // Convert source node `k` to 0-based

        q.add(new Tuple(k - 1, 0));

        while (!q.isEmpty()) {
            Tuple it = q.poll();
            int node = it.first;
            int t = it.second;

            for (Tuple iter : adj.get(node)) {
                int adjnode = iter.first;
                int edgetime = iter.second;

                if (t + edgetime < visitedtime[adjnode]) {
                    visitedtime[adjnode] = t + edgetime;
                    q.add(new Tuple(adjnode, visitedtime[adjnode]));
                }
            }
        }

        // Find the maximum time taken to reach any node
        int maxTime = 0;
        for (int time : visitedtime) {
            if (time == Integer.MAX_VALUE) {
                return -1;  // Some nodes are unreachable
            }
            maxTime = Math.max(maxTime, time);
        }

        return maxTime;
    }
}
