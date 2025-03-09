class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String ,Integer> set = new HashMap<>();
       int count =0;
        for(int i =0 ; i<grid.length ; i++){
            int[] col = new int[grid.length];
           for(int j =0 ; j<grid.length ; j++){
            col[j]=(grid[j][i]);
           }
           String c =Arrays.toString(col);  
           set.put(c, set.getOrDefault(c,0)+1);
        }
        for(int[] i:grid){
            String r=Arrays.toString(i);
            count+=set.getOrDefault(r,0);
         
        
        }

        return count;
    }
}
