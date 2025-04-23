package Week5.TransportationNetwork.Train;

import Week5.TransportationNetwork.TransportVehicle.TransportVehicle;

public class Train extends TransportVehicle{
    
    @Override
    public void move() {
        System.out.println("train accelerating on tracks...");
    }
}
