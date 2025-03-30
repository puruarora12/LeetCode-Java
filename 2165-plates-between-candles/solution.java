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
            

        }
        
        int index=0;
        for(int[] q:queries){
            int left = q[0];
            int right = q[1];
            int count =0;
            
           
            int lcandle = set.ceiling(left) ==null ? -1 : set.ceiling(left);
            int rcandle = set.floor(right) ==null ? -1 : set.floor(right);
            
            if(lcandle>=left && lcandle<right && rcandle>left && rcandle<=right ){
            count=plates[rcandle]-plates[lcandle];
            
            }
             ans[index++]=count;
            
            
           
        }
        return ans;
    }
   
}
