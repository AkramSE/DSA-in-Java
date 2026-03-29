import java.util.LinkedList;
import java.util.Queue;
public class FirstNonRepeatingLetter {
   
    public static void printNonRepeating(String str) {
        int[] freq = new int[26]; // To track frequency of 'a' to 'z'
        Queue<Character> q = new LinkedList<>(); 
        
        System.out.print("Result Stream: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            q.add(ch); 
            freq[ch - 'a']++; 
            
            // Remove characters from queue if their frequency is greater than 1
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove(); 
            } 
            
            // If queue is empty, no non-repeating character exists
            if (q.isEmpty()) {
                System.out.print("-1 "); 
            } else {
                System.out.print(q.peek() + " "); 
            } 
        } 
        System.out.println(); 
    } 

    public static void main(String[] args) {
        String str = "aabccxb"; 
        System.out.println("First Non-Repeating Letter:");
        System.out.println("Input String:  " + str);
        
        printNonRepeating(str); 
        // Expected Output: a -1 b b b c x
    }
} 
