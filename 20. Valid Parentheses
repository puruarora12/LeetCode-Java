class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets =  new Stack<>();
        for(char i: s.toCharArray()){
            if( i=='('  || i=='{' || i=='[')
                brackets.push(i);
            else {
                if(brackets.isEmpty()) return false;
                else if(i==')' && brackets.peek()!='(') return false;
                else if(i=='}' && brackets.peek()!='{') return false;
                else if(i==']' && brackets.peek()!='[') return false;
                else brackets.pop();
            }
        }
        return brackets.isEmpty() ? true: false ;
    }
}
