package CarParking;

import CarParking.parkingstrategy.NearToElevator;
import CarParking.parkingstrategy.ParkingStrategy;

import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager{

    static List<ParkingSpot> list;
    ParkingStrategy ps;
    private TwoWheelerManager(List<ParkingSpot> list) {
        super(list);
        ps = new NearToElevator();
    }
    public static TwoWheelerManager twg;
    public static TwoWheelerManager getTwoWheelerManagerInstance(){
        if(twg==null)
            return new TwoWheelerManager(list);
        else
            return twg;
    }
}
