package CarParking.gate;

import CarParking.ParkingSpotManager;
import CarParking.Ticket;
import CarParking.payment.CostComputation;
import CarParking.payment.Payment;

public class ExitGate implements Gate{

    Ticket t;
    ParkingSpotManager psm;
    CostComputation cc;
    Payment pobj;

    int priceCalculate(){return 0;}
    boolean payment(Ticket t){return true;}
    boolean removeVehicle(Ticket t){return true;}
}
