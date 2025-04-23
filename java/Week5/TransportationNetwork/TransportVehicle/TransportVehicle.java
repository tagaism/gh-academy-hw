package Week5.TransportationNetwork.TransportVehicle;

public abstract class TransportVehicle {
    protected String name;
    protected int speed;

    public void start() {
        System.out.println("The vehicle has started!");
    }

    protected abstract void move();
}
