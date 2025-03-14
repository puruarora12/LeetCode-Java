class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(); 
        for(char i : s.toCharArray()){
            if(i>='a' && i<='z' ){
                sb.append(i);
            }else if(i>='A' && i<='Z'){
                sb.append((char)(i-'A'+'a'));
            }else if(i >='0' && i<='9'){
                sb.append(i);
            }
        }
        // System.out.println(sb.toString());
        return sb.toString().equals(sb.reverse().toString()) ? true:false ;
    }
}
