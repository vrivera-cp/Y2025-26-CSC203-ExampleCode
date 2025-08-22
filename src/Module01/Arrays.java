package Module01;

/**
 * A hello program exemplifying array usage.
 * @author Vanessa Rivera
 * @version 1.0
 */
public class Arrays {
    /**
     * The main method that is the program's entry point when executed.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Array Definition
        char[] letters = {'a', 'b', 'd'};

        System.out.println(letters[0]); // a
        System.out.println(letters[1]); // b
        System.out.println(letters[2]); // d

        letters[2] = 'c';
        System.out.println(letters[1]); // c


        // 2D Array
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
        };

        System.out.println(grid);
    }
}