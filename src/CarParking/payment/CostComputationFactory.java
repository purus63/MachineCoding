package CarParking.payment;

import CarParking.Ticket;

public class CostComputationFactory {

    public CostComputation getCCType(Ticket t){
        if(t.getV().toString() =="TwoWheeler")
            return null;
        else
            return null;
    }
}
