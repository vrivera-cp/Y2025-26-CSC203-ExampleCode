package Module04;

public class Car extends Vehicle {
    private boolean isElectric;

    public Car(Point position, double averageSpeed, boolean isElectric) {
        super(position, averageSpeed);
        this.isElectric = isElectric;
    }

    @Override
    public void moveTo(Point position) {
        System.out.println("Vroom!");
        super.position = position; // or this.position
    }
}
