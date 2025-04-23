package Week5.TransportationNetwork;

import Week5.TransportationNetwork.Bicycle.Bicycle;
import Week5.TransportationNetwork.Train.Train;

public class Main {
    public static void main(String[] args) {
        System.out.println("the number of arguments :" + args.length);

        Train jr = new Train();
        Bicycle kama = new Bicycle();

        jr.start();
        jr.move();
        kama.start();
        kama.move();
    }
}
