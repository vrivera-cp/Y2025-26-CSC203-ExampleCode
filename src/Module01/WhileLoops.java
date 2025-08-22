package Module01;

/**
 * A program exemplifying while loop usage.
 * @author Vanessa Rivera
 * @version 1.0
 */
public class WhileLoops {
    /**
     * The main method that is the program's entry point when executed.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Standard While Loop
        int i = 0;
        while (i <= 5) {
            System.out.println(i); // 0 through 5
            i++; // Increment Operator
        }

        // Do-While Loop
        int j = 5;
        do {
            System.out.println(j); // 5 through 0
            j--; // Decrement Operator
        } while (j >= 0);
    }
}