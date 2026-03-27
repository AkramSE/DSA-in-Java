public class BinaryStrings {
    public static void printBinStrings(int n, int lastPlace, String str) {
        // Base case: String size becomes N (n reaches 0)
        if(n == 0) {
            System.out.println(str); 
            return; 
        }
        
        // Choice 1: We can always place a '0'
        printBinStrings(n - 1, 0, str + "0"); 
        
        // Choice 2: We can place a '1' ONLY if the previous character was '0'
        if(lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1"); 
        } 
    }
    
    public static void main(String[] args) { 
        int n = 3;
        System.out.println("Binary strings of length " + n + " without consecutive 1s:");
       
        printBinStrings(n, 0, ""); 
    }
}
