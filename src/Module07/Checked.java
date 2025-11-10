package Module07;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Checked {

    public static void checked() throws IOException {
        Scanner scanner = new Scanner(new File("nonexistent.txt"));
    }

    public static int bad() throws ArithmeticException {
        return 1 / 0;
    }

    public static void main(String[] args) {
        try {
            checked();
            bad();
        } catch (IOException e) {
            System.out.println("Caught the checked exception!");
        }

        throw new IllegalArgumentException("User thrown exception!");
    }
}
