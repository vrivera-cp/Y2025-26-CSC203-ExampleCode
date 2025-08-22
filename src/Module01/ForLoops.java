package Module01;

/**
 * A program exemplifying for loop usage.
 * @author Vanessa Rivera
 * @version 1.0
 */
public class ForLoops {
    /**
     * The main method that is the program's entry point when executed.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Traditional For Loop
        for (int i = 1; i < 4; i++) {
            System.out.print(i + ", "); // 1, 2, 3, 
        }
        System.out.println();

        // Enhanced For Loop
        int[] integers = {1, 2, 3};
        for (int integer : integers) {
            System.out.print(integer + ", "); // 1, 2, 3, 
        }
        System.out.println();
    }
}