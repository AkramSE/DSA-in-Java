public class StringBuilderDemo {

    public static void main(String[] args) { 
        StringBuilder sb = new StringBuilder(""); 
        
        System.out.println("Dynamic length while appending 'a' to 'z':");
        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch); 
            // Printing current length
            System.out.print(sb.length() + " "); 
        } 
        
        System.out.println("\n\nFinal String Result:");
        
        System.out.println(sb.toString()); 
    }
}
