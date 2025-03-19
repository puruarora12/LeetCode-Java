class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Long> s = new Stack<>();

       for(String i :tokens){
        // System.out.println(i);
        if(!i.equals("+") && !i.equals("-") && !i.equals("*") && !i.equals("/") )s.push(Long.parseLong(i));
        else {
            long num2= s.pop();
            long num1 = s.pop();
            if(i.equals("+"))s.push(num2+num1);
            else if(i.equals("-"))s.push(num1-num2);
            else if(i.equals("/"))s.push(num1/num2);
            else s.push(num2*num1);
            // System.out.println("curr value "+s.peek());
        }
       }
       return Math.toIntExact(s.pop()); 
    }
}
