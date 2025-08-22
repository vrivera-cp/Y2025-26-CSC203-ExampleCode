package Module01;

/**
 * A program exemplifying Java strings.
 * @author Vanessa Rivera
 * @version 1.0
 */
public class Strings {
    /**
     * The main method that demonstrates String usage.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Instantiation
        String s = "Module01.Hello";

        // String Module01.Methods
        int size = s.length();
        System.out.println(size); // 5
        
        char last = s.charAt(4);
        System.out.println(last); // o

        // Comparison
        String s2 = "Module01.Hello";              // Instantiation?
        System.out.println(s == s2);      // true
        System.out.println(s.equals(s2)); // true

        String s3 = new String("Module01.Hello");  // Instantiation
        System.out.println(s == s3);      // false
        System.out.println(s.equals(s3)); // true
    }
}