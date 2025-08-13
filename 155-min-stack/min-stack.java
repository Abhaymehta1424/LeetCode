class MinStack {
    Stack<Integer> stk;
    public MinStack() {
        stk = new Stack<>();
    }
    
    public void push(int val) {
            stk.push(val);
        
    }
    
    public void pop() {
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i : stk){
            min = Math.min(i,min);
        }
        return min;
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