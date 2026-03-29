import java.util.LinkedList;
import java.util.Queue;
public class StackUsingTwoQueues {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }
        
        // Push operation - O(1) Time Complexity
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }
        
        // Pop operation - O(n) Time Complexity
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = -1;
            
            // Case 1: Elements are in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break; // Leave the last element to be popped
                    }
                    q2.add(top);
                }
            } 
            // Case 2: Elements are in q2
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        
        // Peek operation - O(n) Time Complexity
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = -1;
            
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        System.out.println("Stack Implementation using Two Queues:");
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        System.out.println("Popping elements from Stack:");
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
                       }
