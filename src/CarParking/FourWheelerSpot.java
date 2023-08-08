package CarParking;

import CarParking.parkingstrategy.NearToEntrance;
import CarParking.parkingstrategy.ParkingStrategy;

public class FourWheelerSpot extends ParkingSpot{

    int getPrice(){
        return super.price+20;
    }
}
