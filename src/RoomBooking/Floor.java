package RoomBooking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Floor {

    List<Room> roomList;
    String floorId;

    public Floor() {
        this.roomList=new ArrayList<>();
        this.floorId= UUID.randomUUID().toString();
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }
}
