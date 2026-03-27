import java.util.Stack;

public class ValidParentheses {
    
    // O(n) logic to check if string contains valid and properly closed parentheses
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Step 1: If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // Step 2: If closing bracket, check for matching opening bracket at top
                if (s.isEmpty()) {
                    return false; // Extra closing bracket
                }
                
                if ((s.peek() == '(' && ch == ')') 
                 || (s.peek() == '{' && ch == '}') 
                 || (s.peek() == '[' && ch == ']')) {
                    s.pop(); // Match found
                } else {
                    return false; // Mismatched bracket
                }
            }
        }
        
        // Step 3: Stack should be empty if all brackets matched correctly
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println("Valid Parentheses:");
        System.out.println("String: " + str);
        System.out.println("Is Valid? " + isValid(str)); // Output should be true
    }
} 
