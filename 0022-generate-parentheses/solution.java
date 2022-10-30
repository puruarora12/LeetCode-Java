class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        calculate(0 ,0, n , ans , "");
        return ans;
    }
    
    private void calculate(int open, int closed ,int n , List<String> ans , String ar){
        if(ar.length()==n*2){
            ans.add(ar);
            return;
        }
        if(open<n)calculate(open+1, closed , n , ans , ar+"(");
        if(closed<open) calculate(open , closed+1 , n , ans , ar+")");
           
    }
}
