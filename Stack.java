package dsaindividualassignment;

class Stack {
    private Node top; 

    
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public boolean isEmpty() {
        return top == null;
    }

    
    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(data + " pushed to the stack.");
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        }
        int poppedValue = top.data;
        top = top.next;
        System.out.println(poppedValue + " popped from the stack.");
        return poppedValue;
    }

    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        }
        System.out.println("Top element of the stack: " + top.data);
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(13);
        stack.push(16);
        stack.push(19);

        stack.peek(); 
        stack.pop(); 
        stack.peek(); 
    }
}

