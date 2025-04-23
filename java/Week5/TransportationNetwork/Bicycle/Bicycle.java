package Week5.TransportationNetwork.Bicycle;

import Week5.TransportationNetwork.TransportVehicle.TransportVehicle;

public class Bicycle extends TransportVehicle {
    

    @Override
    public void move() {
        System.out.println("pedaling...");
    };
}
