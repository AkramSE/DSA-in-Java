public class CircularQueueUsingArray {

    static class Queue {
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front; // Modular Arithmetic for circular logic
        }

        // Add - O(1) Time Complexity
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full!");
                return;
            }
            // Add 1st element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove - O(1) Time Complexity (No shifting needed)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int result = arr[front];
            
            // If only one element was left
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek - O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        System.out.println("Circular Queue Implementation using Array:");
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Removed: " + q.remove()); // removes 1
        q.add(4);

        System.out.println("Removed: " + q.remove()); // removes 2
        q.add(5);

        System.out.println("Emptying the rest of the Queue:");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
