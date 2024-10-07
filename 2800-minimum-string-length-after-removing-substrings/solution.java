class Solution {
    public int minLength(String t) {
        Stack<Character> s = new Stack<>();
        for(char i :t.toCharArray()){
            if(i!='B' && i!='D')s.push(i);
            else
           
                if(s.size()>0 && (( i=='B' && s.peek()=='A' ) || ( i=='D' && s.peek()=='C'))) s.pop();
                else s.push(i);
            
         
        }
        return s.size();
    }
}
