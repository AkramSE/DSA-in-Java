public class PalindromeLinkedList {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Helper Method 1: Find Mid Node using Slow-Fast Approach
    public Node findMid(Node head) {
        Node slow = head; 
        Node fast = head; 
        
        while (fast != null && fast.next != null) {
            slow = slow.next;        // +1 jump
            fast = fast.next.next;   // +2 jumps
        } 
        return slow; // 'slow' is my midNode 
    } 
    
    // Main Method: Check if LinkedList is a Palindrome
    public boolean checkPalindrome() { 
        if (head == null || head.next == null) { 
            return true; 
        } 
        
        // Step 1: Find Mid 
        Node midNode = findMid(head); 
        
        // Step 2: Reverse 2nd half 
        Node prev = null; 
        Node curr = midNode; 
        Node next; 
        
        while (curr != null) { 
            next = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = next; 
        } 
        
        Node right = prev; // right half head 
        Node left = head;  // left half head
        
        // Step 3: Check if left half matches right half 
        while (right != null) {
            if (left.data != right.data) {
                return false; 
            } 
            left = left.next; 
            right = right.next; 
        } 
        return true; 
    }

    public static void main(String[] args) {
        PalindromeLinkedList ll = new PalindromeLinkedList();
        ll.addLast(1); ll.addLast(2); ll.addLast(2); ll.addLast(1); 
        
        System.out.println("Check Palindrome LinkedList:");
        System.out.print("List: ");
        ll.print(); // 1 -> 2 -> 2 -> 1 -> null
        
        System.out.println("Is Palindrome? " + ll.checkPalindrome()); 
    }
}
