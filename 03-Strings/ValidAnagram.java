public class ValidAnagram {

    /**
     * Function to check if two strings are anagrams of each other.
     * Uses a frequency array to count character occurrences.
     * * Time Complexity: O(n) where n is the length of the string.
     * Space Complexity: O(1) since the frequency array size is fixed at 26.
     */
    public static boolean isAnagram(String s, String t) {
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array to store the frequency of 26 lowercase English letters
        int[] charCounts = new int[26];

        // Increment count for string 's' and decrement for string 't'
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        // If the strings are anagrams, all counts should be exactly 0
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String t1 = "silent";
        
        String s2 = "hello";
        String t2 = "world";
        
        String s3 = "race";
        String t3 = "care";

        System.out.println("Are \"" + s1 + "\" and \"" + t1 + "\" anagrams? " + isAnagram(s1, t1)); // Output: true
        System.out.println("Are \"" + s2 + "\" and \"" + t2 + "\" anagrams? " + isAnagram(s2, t2)); // Output: false
        System.out.println("Are \"" + s3 + "\" and \"" + t3 + "\" anagrams? " + isAnagram(s3, t3)); // Output: true
    }
}
