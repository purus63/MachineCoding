package CarParking;

public class TwoWheelerSpot extends ParkingSpot {

    int getPrice(){
        return super.price+10;
    }
}
