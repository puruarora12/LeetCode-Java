class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int[] ans = new int[queries.length];
        TreeSet<Integer> set= new TreeSet<>();
        int[] plates = new int[s.length()];
        int plate =0;
        for(int i = 0 ; i <s.length(); i++){
            if(s.charAt(i)=='*') plate++;
            if(s.charAt(i)=='|')set.add(i);
            plates[i]=plate;
            // System.out.print(plates[i]+"  ");

        }
        // System.out.println();
        // HashMap<List<Integer>, Integer>map = new HashMap<>();
        int index=0;
        for(int[] q:queries){
            int left = q[0];
            int right = q[1];
            int count =0;
            
           
            int lcandle = set.ceiling(left) ==null ? -1 : set.ceiling(left);
            int rcandle = set.floor(right) ==null ? -1 : set.floor(right);
            // System.out.println("left "+left +"  right "+right);
            // System.out.println("rcandle "+rcandle+"  lcanlde "+lcandle+"  plates floor  "+plates[lcandle]+"   ceil "+plates[rcandle]);
            if(lcandle>=left && lcandle<right && rcandle>left && rcandle<=right ){
            // if(map.containsKey(pf)) ans[index++]=map.get(pf);
            count=plates[rcandle]-plates[lcandle];
            
            }
            // System.out.println(prev+"     "+floor);
            
            
        
        // map.put(lr, count);
        // map.put(pf , count);
 
             ans[index++]=count;
            
            
            //find(s.substring(left, right+1));
        }
        return ans;
    }
    public int find(String s){
        
        int left = s.indexOf("|");
        int right= s.lastIndexOf("|");
        // System.out.println(s+"  "+left +"   "+right);
        int count =0 ; 
        while(left<right){
            if(s.charAt(left)=='*')count++;
            left++;
        }
        return count;
    }
}
