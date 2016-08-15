class MyStack {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    static int top = 0;
    // Push element x onto stack.
    public void push(int x) {
        while(!q1.isEmpty()) {
            q2.offer(q1.poll());
            //System.out.println(q1);
        }
        q1.offer(x);
        while(!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q1.poll();
        
      
    }
    

    // Get the top element.
    public int top() {
        int x = q1.peek();
        return x;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
        
    }
}
//just poll every element in the front and insert them to the same queue. A stack is made.(using one queue.)