class Solution {
    public int equalPairs(int[][] grid) {
        // int row[]=new int[grid.length];
        
        HashMap<String ,Integer> set = new HashMap<>();
       int count =0;
        boolean isEqual =true;
        for(int i =0 ; i<grid.length ; i++){
            int[] col = new int[grid.length];
           for(int j =0 ; j<grid.length ; j++){
            col[j]=(grid[j][i]);
           } 
           set.put(Arrays.toString(col), set.getOrDefault(Arrays.toString(col),0)+1);
        }
        // for(String i:set){ 
        //     System.out.print(i+" ");
        //     System.out.println();
        // }
        // System.out.println();
        for(int[] i:grid){
            if(set.containsKey(Arrays.toString(i)))count+=set.get(Arrays.toString(i));
            
            //  for(int z:i) 
            // System.out.print(Arrays.toString(i)+" ");
            // System.out.println();
        
        }

        return count;
    }
}
