public class RemoveDuplicates {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        // Base case: Reached the end of the string
        if(idx == str.length()) {
            System.out.println("Result String:   " + newStr); 
            return; 
        } 
        
        char currChar = str.charAt(idx); 
        if(map[currChar - 'a'] == true) { 
            // Duplicate found, skip and move to next character
            removeDuplicates(str, idx + 1, newStr, map); 
        } else {
            // New character found, mark as true in map and append
            map[currChar - 'a'] = true; 
            removeDuplicates(str, idx + 1, newStr.append(currChar), map); 
        }
    }

    public static void main(String[] args) { 
        String str = "akram"; // Changed to your name!
        
        System.out.println("Original String: " + str);
        
        // Passing a boolean array of size 26 for 'a' to 'z'
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]); 
    }
}
