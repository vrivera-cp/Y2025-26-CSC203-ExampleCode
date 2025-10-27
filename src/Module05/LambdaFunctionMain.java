package Module05;

import java.util.List;

public class LambdaFunctionMain {
    public static void main(String[] args) {
        // Lambda Functions as Instances
        IntOp adder = (x, y) -> x + y;
        IntOp multiplier = (x, y) -> x * y;
        IntOp vectorMeasurer = (x, y) -> {
            int z = x * x + y * y;
            double sqrtZ = Math.sqrt(z);
            return (int) sqrtZ;
        };

        // Calling Lambda Functions
        System.out.println(adder.operate(3, 4));
        System.out.println(multiplier.operate(3, 4));
        System.out.println(vectorMeasurer.operate(3, 4));

        // Polymorphism
        List<IntOp> operations = List.of(adder, multiplier, vectorMeasurer);
        for (IntOp operation : operations) {
            int result = operation.operate(3, 4);
            System.out.println(result);
        }
    }
}
