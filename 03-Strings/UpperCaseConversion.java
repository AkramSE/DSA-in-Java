public class UpperCaseConversion {

    public static String toUpperCase(String str) {
        if(str == null || str.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder("");
        
        // Capitalize the very first character
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for(int i=1; i<str.length(); i++) {
            // If current char is space and it's not the last character
            if(str.charAt(i) == ' ' && i < str.length()-1) {
                sb.append(str.charAt(i));
                i++; // Move to the next character
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "i am a software engineering student";
        
        System.out.println("Original String: " + str);
        System.out.println("Converted to:    " + toUpperCase(str));
    }
} 
