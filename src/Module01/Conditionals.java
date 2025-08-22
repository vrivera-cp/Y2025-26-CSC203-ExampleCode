package Module01;

/**
 * A program exemplifying conditional usage.
 * @author Vanessa Rivera
 * @version 1.0
 */
public class Conditionals {
    /**
     * The main method that is the program's entry point when executed.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Standard Conditions
        if (100 < 10) {
            System.out.println("a");
        } else if (100 < 1000) {
            System.out.println("b"); // Printed
        } else {
            System.out.println("c");
        }

        // Conditional Operator
        char result = 100 == 10 ? 'a' : 'b';
        System.out.println(result);
    }
}