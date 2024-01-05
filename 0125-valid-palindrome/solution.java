class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> ar = new ArrayList<>();
        //s.replace(" " , "");
        //s.lowerCase();
        for(int i = 0 ; i<s.length() ; i++){
            //System.out.println(s.charAt(i));
            if(s.charAt(i)>='A'&& s.charAt(i)<='Z'){
                ar.add((char)(s.charAt(i)+32));
                
            }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                ar.add(s.charAt(i));
            }else if(s.charAt(i)>='0' && s.charAt(i)<='9') ar.add(s.charAt(i));
            else continue;
            //System.out.println(ar);
        }
        
        ArrayList<Character> ar2 = new ArrayList<>(ar);
        Collections.reverse(ar);
        //System.out.println(ar);
        //System.out.println(ar2);
        if(ar.equals(ar2)) return true;
        else return false;
        
    }
}
