class MyQueue {
    private Stack<Integer> s1,s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
            s2.push(s1.pop());
            }
        }
        if(s2.isEmpty()){
            System.out.println("Oueue is empty");
            return -1;
        }
        return s2.pop();
    }
    
    public int peek() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
            s2.push(s1.pop());
            }
        }
        if(s2.isEmpty()){
            System.out.println("Oueue is empty");
            return -1;
        }
        return s2.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
