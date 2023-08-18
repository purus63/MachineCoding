package RoomBooking;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {

    String userid;
    String ticketid;
    String starttime;
    String endtime;
    Room room;

    public Ticket(String userid, Room room, String to, String from) {
        this.userid=userid;
        this.ticketid= UUID.randomUUID().toString();
        starttime=from;
        this.room=room;
        endtime=to;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTicketid() {
        return ticketid;
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "userid='" + userid + '\'' +
                ", ticketid='" + ticketid + '\'' +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", room=" + room +
                '}';
    }
}
