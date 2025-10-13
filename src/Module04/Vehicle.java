package Module04;

public abstract class Vehicle {

    protected Point position;
    private double averageSpeed;

    public Vehicle(Point position, double averageSpeed) {
        this.position = position;
        this.averageSpeed = averageSpeed;
    }

    public abstract void moveTo(Point position);

    public double getAverageSpeed() {
        return averageSpeed;
    }
}
