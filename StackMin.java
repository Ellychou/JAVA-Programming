public class StackMin {
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();

	public void push(int x){
		stack.push(x);
		if (minStack.isEmpty() || x <= minStack.peek()){
			minStack.push(x);
		}
	}
	public void pop() {
		if ((int)minStack.peek() == (int)stack.peek()) {
			minStack.pop();
		}
		stack.pop();
	}
	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}

}



class MinStack {
    Node top = null;  
  
    public void push(int x) {  
        if (top == null) {  
            top = new Node(x);  
            top.min = x;  
        } else {  
            Node temp = new Node(x);  
            temp.next = top;  
            top = temp;  
            top.min = Math.min(top.next.min, x);  
        }  
    }  
  
    public void pop() {  
        top = top.next;  
        return;  
    }  
  
    public int top() {  
        return top == null ? 0 : top.val;  
    }  
  
    public int getMin() {  
        return top == null ? 0 : top.min;  
    }  
}  
  
class Node {  
    int val;  
    int min;  
    Node next;  
  
    public Node(int val) {  
        this.val = val;  
    }  
  

}
