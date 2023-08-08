package CarParking.payment;

import CarParking.Ticket;

public class HourlyPricingStrategy extends PricingStrategy {

    int price(Ticket t){
        return super.price + 100;
    }
}
