class Solution {
    public int[] findOrder(int n, int[][] pre) {
        List<List<Integer>> adj= new ArrayList<>();
        for(int i =0 ; i<n ; i++) adj.add(new ArrayList<>());

        for(int i =0 ; i<pre.length ; i++) adj.get(pre[i][0]).add(pre[i][1]);

        int indegree[] = new int[n];
        for(int i=0; i<n; i++)
            for(int j:adj.get(i))
                indegree[j]++;

        Queue<Integer> q = new LinkedList<>();
        for(int i =0 ; i<n ; i++) 
            if(indegree[i]==0)
                q.add(i);
    

        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()){
            int curr = q.remove();
            ans.add(curr);

            for(int id: adj.get(curr)){
                indegree[id]--;
                if(indegree[id]==0) q.add(id); 
            }
        }
        Collections.reverse(ans);
        return ans.size()==n ? ans.stream().mapToInt(Integer::intValue).toArray() : new int[]{};
    }
}
