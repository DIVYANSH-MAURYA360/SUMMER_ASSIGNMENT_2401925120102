class MyQueue {
    Stack<Integer> inbox, outbox;

    public MyQueue() {
        inbox = new Stack<>();
        outbox = new Stack<>();
    }
    
    public void push(int x) {
        inbox.push(x);
    }
    
    public int pop() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) outbox.push(inbox.pop());
        }
        return outbox.pop();
    }
    
    public int peek() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) outbox.push(inbox.pop());
        }
        return outbox.peek();
    }
    
    public boolean empty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }
}
