class MinStack {
Stack<Long> s ;
PriorityQueue<Long> pq ;
    public MinStack() {
        s = new Stack<>();
        pq = new PriorityQueue<>();
    }
    
    public void push(int val) {
        s.push(new Long(val));
        pq.offer(new Long(val));
        // System.out.println(pq);
    }
    
    public void pop() {
        pq.remove(s.pop());
    }
    
    public int top() {
        return Math.toIntExact(s.peek());//.intValue();
    }
    
    public int getMin() {
        return Math.toIntExact(pq.peek());//.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
