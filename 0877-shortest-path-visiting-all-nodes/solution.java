import java.util.*;

public class Solution {
    public int shortestPathLength(int[][] graph) {
        int V = graph.length;
        Queue<int[]> currLevel = new LinkedList<>();
        for (int u = 0; u < V; u++) {
            currLevel.offer(new int[]{u, 1 << u});
        }
        
        int allVisited = (1 << V) - 1;
        boolean[][] visited = new boolean[V][allVisited + 1];
        for (int u = 0; u < V; u++) {
            visited[u][1 << u] = true;
        }
        
        int pathLength = 0;
        
        while (!currLevel.isEmpty()) {
            int n = currLevel.size();
            while (n > 0) {
                int[] node = currLevel.poll();
                int u = node[0];
                int bitMask = node[1];
                
                if (bitMask == allVisited) {
                    return pathLength;
                }
                
                for (int v : graph[u]) {
                    int nextBitMask = bitMask | (1 << v);
                    
                    if (visited[v][nextBitMask]) {
                        continue;
                    }
                    
                    if (nextBitMask == allVisited) {
                        return pathLength + 1;
                    }
                    
                    currLevel.offer(new int[]{v, nextBitMask});
                    visited[v][nextBitMask] = true;
                }
                
                n--;
            }
            
            pathLength++;
        }
        
        return -1;
    }
}
