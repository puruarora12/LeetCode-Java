class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<>();
        while(n!=1){
            int temp = 0 ; 
            while(n>0){
                temp += (n%10)*(n%10);
                n/=10;
            }
            n=temp;
            if(s.contains(n)) return false;
            s.add(n);
        }
        return true;
    }
}
