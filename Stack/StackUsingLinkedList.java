public class StackUsingLinkedList {
    
    // Node Class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Internal Stack implementation using LinkedList
    static class Stack {
        static Node head = null;
        
        // 1. Check if empty
        public static boolean isEmpty() {
            return head == null;
        }
        
        // 2. Push operation - O(1)
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        
        // 3. Pop operation - O(1)
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        
        // 4. Peek operation - O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Stack Implementation using Custom LinkedList:");
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        System.out.println("Emptying the stack...");
        while (!s.isEmpty()) {
            System.out.println("Popped: " + s.peek());
            s.pop();
        }
    }
}
