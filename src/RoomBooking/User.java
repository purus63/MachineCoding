package RoomBooking;

import java.util.List;

public class User {
    private String name;
    private String userid;

    public User(String name, String userid) {
        this.name=name;
        this.userid=userid;
    }

    List<Ticket> getAllBooking(){
        return UserPortal.map.get(this.userid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
