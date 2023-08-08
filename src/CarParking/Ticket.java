package CarParking;

public class Ticket {
    long entrytime;
    Vehicle v;
    ParkingSpot p;

    public long getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(long entrytime) {
        this.entrytime = entrytime;
    }

    public Vehicle getV() {
        return v;
    }

    public void setV(Vehicle v) {
        this.v = v;
    }

    public ParkingSpot getP() {
        return p;
    }

    public void setP(ParkingSpot p) {
        this.p = p;
    }
}
