public class LinearSearch {

    // Method 1: Linear Search for integer arrays
    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i; // Key found, return index
            }
        }
        return -1; // Key not found
    }

    // Method 2: Linear Search for String arrays (Case-Insensitive)
    public static int linearSearch(String[] items, String key) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(key)) { 
                return i; // String found
            }
        }
        return -1; // String not found
    }

    public static void main(String[] args) {
        
        // --- Test Case 1: Integer Array ---
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int intKey = 10;
        int intIndex = linearSearch(numbers, intKey);

        System.out.println("--- Integer Linear Search ---");
        if (intIndex == -1) {
            System.out.println("Key " + intKey + " is Not Found");
        } else {
            System.out.println("Key " + intKey + " is at index: " + intIndex);
        }

        // --- Test Case 2: String Array ---
        String[] menu = {"Fries 🍟", "Burger 🍔", "Sandwich 🥪", "Samosa"};
        String stringKey = "samosa";
        int stringIndex = linearSearch(menu, stringKey);

        System.out.println("\n--- String Linear Search ---");
        if (stringIndex == -1) {
            System.out.println("Item Not Found in Menu");
        } else {
            System.out.println("Item found at index: " + stringIndex);
            System.out.println("You selected: " + menu[stringIndex]);
        }
    }
}
