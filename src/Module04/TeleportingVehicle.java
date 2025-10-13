package Module04;

public abstract class TeleportingVehicle extends Vehicle {

    private double maximumDistance;

    public TeleportingVehicle(Point position, double maximumDistance) {
        super(position, Double.POSITIVE_INFINITY);
        this.maximumDistance = maximumDistance;
    }

    public double getMaximumDistance() {
        return maximumDistance;
    }

}
