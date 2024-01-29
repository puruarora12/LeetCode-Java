class MyQueue {
    Stack<Integer> in;Stack<Integer> out;
    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        while(!in.isEmpty()){
            out.push(in.pop());
        }
        int x = out.pop();
        while(!out.isEmpty()){
            in.push(out.pop());
        }
        return x;
    }
    
    public int peek() {
         while(!in.isEmpty()){
            out.push(in.pop());
        }
        int x = out.peek();
        while(!out.isEmpty()){
            in.push(out.pop());
        }
        return x;
    }
    
    public boolean empty() {
        return in.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
