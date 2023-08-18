package RoomBooking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Building {

    List<Floor> floorList;
    String building_id;

    public Building() {
        this.floorList = new ArrayList<>();
        building_id = "a";
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public String getBuilding_id() {
        return building_id;
    }

    public void setBuilding_id(String building_id) {
        this.building_id = building_id;
    }
}
