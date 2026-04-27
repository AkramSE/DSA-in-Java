public class StringPermutations {

    /**
     * Recursive function to print all permutations of a string.
     * Time Complexity: O(n * n!)
     * Space Complexity: O(n) for the recursion call stack
     */
    public static void printPermutations(String str, String perm) {
        // Base case: If the original string is empty, we have found a permutation
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        // Recursive case: Pick each character one by one and find permutations of the rest
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            
            // Remove the current character from the string
            String newStr = str.substring(0, i) + str.substring(i + 1);
            
            // Recursive call with the remaining string and updated permutation string
            printPermutations(newStr, perm + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("All permutations of the string \"" + str + "\" are:");
        printPermutations(str, "");
    }
}
