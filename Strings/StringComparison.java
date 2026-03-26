public class StringComparison {
    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        // 1. Comparing References (Memory Address)
        System.out.println("Reference Comparison (s1 == s2): "+(s1==s2)); // true (Same object in String Pool)
        
        // 2. Comparing References with 'new' keyword
        System.out.println("Reference Comparison (s1 == s3): "+(s1==s3)); // false (Different objects in memory)

        // 3. Comparing Content (The professional way)
        if(s1.equals(s3)) {
            System.out.println("Content Comparison (s1.equals(s3)): Strings are equal");
        } else {
            System.out.println("Content Comparison (s1.equals(s3)): Strings are NOT equal");
        }
    }
}
