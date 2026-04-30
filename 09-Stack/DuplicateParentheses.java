import java.util.Stack;

public class DuplicateParentheses {

    /**
     * Function to check if a valid mathematical expression contains duplicate parentheses.
     * Time Complexity: O(n) where n is the length of the string.
     * Space Complexity: O(n) for the stack.
     */
    public static boolean hasDuplicateParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If we encounter a closing bracket
            if (ch == ')') {
                int elementsInside = 0;
                
                // Pop elements until we find the matching opening bracket '('
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    elementsInside++;
                }
                
                // If there were no elements between '(' and ')', it means they are duplicates
                if (elementsInside < 1) {
                    return true; // Duplicate found
                } else {
                    stack.pop(); // Pop the matching opening bracket '('
                }
            } else {
                // Push opening brackets, operators, and operands to the stack
                stack.push(ch);
            }
        }

        return false; // No duplicates found
    }

    public static void main(String[] args) {
        // Test Case 1: Contains duplicate parentheses around the whole expression
        String str1 = "((a+b))"; 
        
        // Test Case 2: Contains duplicate parentheses around c+d
        String str2 = "(a+b)+((c+d))"; 
        
        // Test Case 3: No duplicate parentheses
        String str3 = "(((a+(b)))+(c+d))"; 
        
        // Test Case 4: Standard valid expression
        String str4 = "(a+b)"; 

        System.out.println("Expression: " + str1 + " -> Has Duplicates? " + hasDuplicateParentheses(str1)); // Output: true
        System.out.println("Expression: " + str2 + " -> Has Duplicates? " + hasDuplicateParentheses(str2)); // Output: true
        System.out.println("Expression: " + str3 + " -> Has Duplicates? " + hasDuplicateParentheses(str3)); // Output: false
        System.out.println("Expression: " + str4 + " -> Has Duplicates? " + hasDuplicateParentheses(str4)); // Output: false
    }
}
