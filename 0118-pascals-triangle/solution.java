class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ln = new ArrayList<>();
        
        for(int i = 0 ; i<n ; i++){
            List<Integer> ls = new ArrayList<>(); 
            for(int j = 0 ; j<i+1 ; j++){
                if(j==0 || j==i) ls.add(1);
                else{
                    ls.add(ln.get(i-1).get(j)+ln.get(i-1).get(j-1));
                }
            }
            ln.add(ls);
        }
        return ln;
    }
}
/*
1: 1
2: 1 1
3: 1 2 1
4: 1 3 3 1
5: 1 4 6 4 1
6: 1 5 10 10 5 1
7: 1 6 15 20 15 6 1
8: 1 7 21 35 35 21 7 1
9: 1 8 28 56 70 56 28 8 1
X: 1 9 36 76 126 126 76 36 9 1
    */
