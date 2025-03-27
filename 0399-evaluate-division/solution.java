class Solution {
   

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double ans[] = new double[queries.size()];
        Arrays.fill(ans,-1.0);
        HashMap<String , Map<String, Double>> map = new HashMap<>();
        // HashMap<String , Node> endmap = new HashMap<>();
        for(int i  = 0 ; i<equations.size() ; i++){
            String start = equations.get(i).get(0);
            String end =equations.get(i).get(1);//[i][1];
            map.putIfAbsent(start, new HashMap<>());
            map.get(start).put(end, values[i]);
            map.putIfAbsent(end, new HashMap<>());
            map.get(end).put(start, 1.0/values[i]);
            
            // endmap.put()
        }
        for(int i = 0 ; i<queries.size(); i++){
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);
            ans[i]=dfs(start, end, new HashSet<>(), map );
        }
        return ans;
    }

    private double dfs(String start, String end, Set<String> visited, HashMap<String , Map<String, Double>> map){
            if(!map.containsKey(start)|| !map.containsKey(end)) return -1.0;
            else if(map.containsKey(start) && map.get(start).containsKey(end)) 
                return map.get(start).get(end);
                
            double total =1 ;
            visited.add(start);
            for(String i: map.get(start).keySet()){
                if(!visited.contains(i)){
                    double value= dfs(i, end, visited, map);
                    if(value!=-1)return map.get(start).get(i)*value;
                }
            }
            return -1.0;
    }
}
