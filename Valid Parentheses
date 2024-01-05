class Solution {
    public boolean isValid(String w) {
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i <w.length() ; i++){
            if(w.charAt(i)=='(')s.push(w.charAt(i));
            if(w.charAt(i)=='[')s.push(w.charAt(i));
            if(w.charAt(i)=='{')s.push(w.charAt(i));
            if(w.charAt(i)=='}')if(!s.isEmpty() && s.peek()=='{')s.pop();else return false;
            if(w.charAt(i)==']')if(!s.isEmpty() && s.peek()=='[')s.pop();else return false;
            if(w.charAt(i)==')')if(!s.isEmpty() && s.peek()=='(')s.pop();else return false;
        }
        if(s.isEmpty()) return true;
        else return false;
    }
}
