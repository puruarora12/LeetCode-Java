class Solution {
    public int minLength(String t) {
        Stack<Character> s = new Stack<>();
        for(char i :t.toCharArray()){
            // System.out.println(i);
            if(i!='B' && i!='D')s.push(i);
            else{
                // System.out.println("in else ");
                if(s.size()>0 && (( i=='B' && s.peek()=='A' ) || ( i=='D' && s.peek()=='C'))){ s.pop();
                // System.out.println("popped");
                }else s.push(i);
            }
            // System.out.println("peeked "+s.peek());
        }
        return s.size();
    }
}
