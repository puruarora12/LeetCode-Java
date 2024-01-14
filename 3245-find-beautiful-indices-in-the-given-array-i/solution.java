class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> left = new ArrayList<>();
        for(int i = 0 ; i<=s.length()-a.length() ; i++)
            if(s.substring(i , i+a.length()).equals(a))left.add(i);
        
        
    List<Integer> right = new ArrayList<>();
        for(int i = 0 ; i<=s.length()-b.length() ; i++)
            if(s.substring(i , i+b.length()).equals(b))right.add(i);
        System.out.println(left);
        System.out.println(right);
    List<Integer> ans = new ArrayList<>();
      
    
        for(int i:left){
            int index = Collections.binarySearch(right, i);
            if(index<0)index = -index-1;
            if(index>0&& Math.abs(right.get(index-1)-i)<=k && !ans.contains(i)) ans.add(i);
            if(index<right.size() && Math.abs(right.get(index)-i)<=k&& !ans.contains(i))ans.add(i);
        }
        return ans;//Collections.sort(ans);
        
    }
}
