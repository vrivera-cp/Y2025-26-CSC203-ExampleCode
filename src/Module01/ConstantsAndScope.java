package Module01;

/**
 * A program exemplifying local and class constants.
 * @author Vanessa Rivera
 * @version 1.0
 */
public class ConstantsAndScope {
    /**
     * Class constant conversion ratio
     */
    public static final double CM_PER_INCH = 2.54;

    /**
     * The main method that demonstrates constant usage.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        double length = 12.0; // Inches
        System.out.println("Square Length (in): " + length);
        System.out.println("Square Area (cm^2): " + getSquareArea(length));

        double radius = 12.0; // Inches
        System.out.println("Circle Radius (in): " + radius);
        System.out.println("Circle Area (cm^2): " + getCircleArea(radius));
    }

    /**
     * Returns a square's area in square centimeters.
     * @param length The square's side length in inches
     * @return The square's area in square centimeters
     */
    public static double getSquareArea(double length) {
        return length * CM_PER_INCH;
    }

    /**
     * Returns a circle's area in square centimeters.
     * @param radius The circle's radius in inches
     * @return The circle's area in square centimeters
     */
    public static double getCircleArea(double radius) {
        final double PI = 3.14;

        radius = radius * CM_PER_INCH;

        return PI * radius * radius;
    }
}