class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            if(set.contains(n))return false;
            long temp = 0;
            set.add(n);
            for(char c: (n+"").toCharArray())temp+=Math.pow((c-'0'), 2);
            n=(int)temp;
            // if(n==og) return false;
        }


    return n==1? true: false;    
    }
}
