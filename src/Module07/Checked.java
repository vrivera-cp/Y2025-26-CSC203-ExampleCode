package Module07;

public class Checked {

    public static int checked() throws ArithmeticException {
        return 1 / 0;
    }

    public static void main(String[] args) {
        try {
            checked();
        } catch (ArithmeticException e) {
            System.out.println("Caught the checked exception!");
        }

        throw new IllegalArgumentException("User thrown exception!");
    }
}
