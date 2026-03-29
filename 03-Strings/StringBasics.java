public class StringBasics {

    public static void printLetters(String str) {
        // Professional way to show character sequence
        System.out.print("Character Sequence: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. Initialization Styles
        String str1="abcde";
        String str2=new String("abcde");
        
        System.out.println("Initialization:");
        System.out.println("Literal: " + str1);
        System.out.println("Object:  " + str2);

        // 2. String Metadata
        String name="Muhammad Akram";
        System.out.println("\nString Details:");
        System.out.println("Value:  " + name);
        System.out.println("Length: " + name.length() + " characters");

        // 3. Concatenation logic
        String firstName="Muhammad";
        String lastName="Akram";
        String fullName=firstName+" "+lastName;
        
        System.out.println("\nConcatenation Result: " + fullName);

        // 4. Character Traversal
        printLetters(fullName);
    }
}
