package Module04;

public class Boat extends Vehicle {
    public Boat(Point position, double averageSpeed) {
        super(position, averageSpeed);
    }

    @Override
    public void moveTo(Point position) {
        System.out.println("Swoosh!");
        super.position = position; // or this.position
    }
}
