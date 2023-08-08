package CarParking.payment;

import CarParking.Ticket;

public class CostComputation {
    PricingStrategy obj;

    int price(Ticket t){
        return  obj.price(t);
    }
}
