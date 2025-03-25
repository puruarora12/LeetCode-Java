class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(n,n,new StringBuilder(), ans);
        return ans;
    }
    public void dfs(int start, int end, StringBuilder sb , List<String> ans){
        if(start==0 && end==0){
            ans.add(sb.toString());
            return;

        }

        if(start>0){
            sb.append("(");
            dfs(start-1, end , sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }

        if(end>start){
            sb.append(")");
            dfs(start, end-1 , sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
