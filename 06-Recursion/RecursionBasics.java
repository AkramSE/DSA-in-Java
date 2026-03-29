public class RecursionBasics {

    // 1. Print numbers in decreasing order
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // 2. Print numbers in increasing order
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // 3. Find factorial of N
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    // 4. Print sum of first N natural numbers
    public static int calSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calSum(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Decreasing Order (10 to 1): ");
        printDec(10);
        System.out.println();

        System.out.print("Increasing Order (1 to 10): ");
        printInc(10);
        System.out.println();

        int numForFact = 5;
        System.out.println("Factorial of " + numForFact + ": " + fact(numForFact));

        int numForSum = 5;
        System.out.println("Sum of first " + numForSum + " natural numbers: " + calSum(numForSum));
    }
}
