class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int n = nums.size();
        List<int[]> comb = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            for(int j =0 ; j<nums.get(i).size() ; j++)
            comb.add(new int[]{nums.get(i).get(j) , i});
        }

        Collections.sort(comb, (a,b)-> a[0]-b[0]);
        // for(int x[] :comb) System.out.println(x[0]+"    "+x[1]);
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0 ; int right = 0;
        int c= comb.get(0)[0] , d=comb.get(comb.size()-1)[0];
        int newn = comb.size();
        while(right<newn){
            int list = comb.get(right)[1];
            map.put(list ,map.getOrDefault(list,0)+1);
            // System.out.println(map.size()+"   "+n);
            while(map.size()>=n){
                if( check(comb.get(left)[0] , comb.get(right)[0] ,c, d ) ){
                    c=comb.get(left)[0];
                    d=comb.get(right)[0];
                }
                
                int toRemove = comb.get(left)[1];
                map.put(toRemove, map.get(toRemove)-1);
                if(map.get(toRemove)==0)map.remove(toRemove);
                left++;
            }
            right++;
        }
        return new int[]{c,d};
    }
    public boolean check(int a , int b, int c, int d){
        if(b-a<d-c)return true;
        else if(b-a==d-c && a<c)return true;
        else return false;
    }
}
