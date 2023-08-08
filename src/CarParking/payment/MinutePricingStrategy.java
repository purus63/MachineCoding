package CarParking.payment;

public class MinutePricingStrategy extends PricingStrategy{

    int price(){
        return super.price+50;
    }
}
