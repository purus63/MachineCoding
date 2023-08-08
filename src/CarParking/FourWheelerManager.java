package CarParking;

import CarParking.parkingstrategy.NearToElevator;
import CarParking.parkingstrategy.NearToEntrance;
import CarParking.parkingstrategy.ParkingStrategy;

import java.util.List;

public class FourWheelerManager extends ParkingSpotManager{

    static List<ParkingSpot> list;
    ParkingStrategy ps;
    private FourWheelerManager(List<ParkingSpot> list) {
        super(list);
        ps = new NearToElevator();
    }
    public static FourWheelerManager twg;
    public static FourWheelerManager getFourWheelerManagerInstance(){
        if(twg==null)
            return new FourWheelerManager(list);
        else
            return twg;
    }
}
