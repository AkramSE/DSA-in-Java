public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null; // Represents Front
        static Node tail = null; // Represents Rear

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add (at tail) - O(1)
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Remove (from head) - O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int front = head.data;
            // Single element condition
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // Peek - O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        System.out.println("Queue Implementation using Custom LinkedList:");
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Emptying Queue:");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
