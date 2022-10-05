class Solution {
    public boolean isPalindrome(String s) {
        //String ans = "";
        s=s.toLowerCase();
        ArrayList<Character> ar = new ArrayList<>();
        for(char i : s.toCharArray())
            if((i>='0' && i<='9') || (i>='a' && i<='z') ||(i>='A' && i<='Z') ) 
                ar.add(i);
        
        ArrayList<Character> arr = new ArrayList<>(ar);
        Collections.reverse(arr);
        return arr.equals(ar);
    }
}
