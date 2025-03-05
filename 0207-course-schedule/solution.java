class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0 ; i<numCourses ; i++)adj.add(new ArrayList<Integer>());
        
        for(int i =0 ; i<pre.length ; i++){
            adj.get(pre[i][0]).add(pre[i][1]);
        }

        int indegree[] = new int[numCourses];
        for(int i =0 ; i<numCourses; i++){
            for(int j: adj.get(i)){
                indegree[j]++;
            }
        }
        for(int i =0 ; i<numCourses ; i++){
            System.out.println("for "+i+" position, indegree is "+indegree[i]);
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i =0 ; i<numCourses ; i++ )
        if(indegree[i]==0)q.add(i);

        List<Integer> topo = new ArrayList<>();
        while(!q.isEmpty() ){
            int pos = q.remove();
            topo.add(pos);

            for(int i: adj.get(pos)){
                indegree[i]--;
                if(indegree[i]==0) q.add(i);
            }


        }
        return topo.size()==numCourses ? true:false;
    }
}
