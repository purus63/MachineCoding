package CarParking.gate;

import CarParking.FourWheelerManager;
import CarParking.ParkingSpotManager;
import CarParking.TwoWheelerManager;
import CarParking.Vehicle;

import static CarParking.FourWheelerManager.getFourWheelerManagerInstance;
import static CarParking.TwoWheelerManager.getTwoWheelerManagerInstance;

public class PSFactory {

    ParkingSpotManager getparkingspotManager(Vehicle v)
    {
        if(v.equals("TwoWheeler"))
            return getTwoWheelerManagerInstance();
        else
            return getFourWheelerManagerInstance();
    }
}
