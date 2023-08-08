package CarParking.gate;

import CarParking.*;

public class EntranceGate implements Gate{
    PSFactory factory;
    ParkingSpotManager psm;
    Ticket t;
    ParkingSpot findSpace(Vehicle v, Gate g){
        if(v.equals("TwoWheeler"))
            return new TwoWheelerSpot();
        else
            return new FourWheelerSpot();
    }
    void Bookspace(){}
    Ticket generateTicket(Vehicle v,ParkingSpot ps){ return new Ticket();}
}
