package Module01;

/**
 * A program exemplifying invocation of external and class methods.
 * @author Vanessa Rivera
 * @version 1.0
 */
public class MethodUsage {
    /**
     * The main method that is the program's entry point when executed.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Internal Static Class Method Call
        meow();

        // External Static Method Call
        int x = 1;
        int y = 2;
        int z = Methods.sum(x, y);
        System.out.println(z); // 3
    }

    /**
     * Prints a line containing "Meow".
     */
    public static void meow() {
        System.out.println("Meow!");
    }
}