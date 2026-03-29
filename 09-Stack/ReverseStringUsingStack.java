import java.util.Stack;

public class ReverseStringUsingStack {
    
    // Function to reverse a string using Stack (LIFO principle)
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int indx = 0;
        
        // Step 1: Push all characters of the string into the stack
        while (indx < str.length()) {
            s.push(str.charAt(indx));
            indx++;
        }
        
        // Step 2: Pop characters from the stack to reverse them
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println("Reverse a String using Stack:");
        System.out.println("Original String: " + str);
        
        String result = reverseString(str);
        
        System.out.println("Reversed String: " + result);
    }
} 
