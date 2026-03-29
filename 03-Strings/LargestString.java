public class LargestString {

    public static void main(String[] args) {
        // Finding the lexicographically largest string
        String[] fruits={"Apple 🍎", "Banana 🍌", "Mango 🥭"};
        String largest=fruits[0];
        
        for(int i=1; i<fruits.length; i++) {
            // compareTo() returns < 0 if the string is smaller alphabetically
            if(largest.compareTo(fruits[i]) < 0) {
                largest=fruits[i];
            }
        }

        
        System.out.println("Fruit List:");
        for(String fruit : fruits) {
            System.out.print(fruit + "  ");
        }
        
        System.out.println("\n\nLargest String (Alphabetically): " + largest);
    }
}
