package RoomBooking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookingApp {

    static List<Building> buildingList =null;

    static Building findbuilding(String build_id){
      return buildingList.stream().filter(a->a.getBuilding_id().equals(build_id)).toList().get(0);
    }
    public static void main(String[] args) {

        buildingList= new ArrayList<>();
        initsetup(buildingList);
        UserPortal usp =new UserPortal();
        User a =new User("Ram", UUID.randomUUID().toString());
        usp.getUserList().add(a);

        usp.roombook(a.getUserid(),"2","3");

        System.out.println(a.getAllBooking());

    }

    private static void initsetup(List<Building> buildingList) {
        Building b1 = new Building();
        //Building b2 = new Building();

        Floor f1 =new Floor();
        //Floor f2 = new Floor();
       // Floor f3= new Floor();
        //Floor f4= new Floor();

        Room r1 = new Room();
        /*Room r2 = new Room();
        Room r3 = new Room();
        Room r4 = new Room();
        Room r5 = new Room();
        Room r6 = new Room();
        Room r7 = new Room();
        Room r8 = new Room();

        f1.getRoomList().add(r1);f1.getRoomList().add(r2);
        f2.getRoomList().add(r2);f2.getRoomList().add(r4);
        f3.getRoomList().add(r5);f3.getRoomList().add(r6);
        f4.getRoomList().add(r7);f4.getRoomList().add(r8);*/
        b1.getFloorList().add(f1);
        f1.getRoomList().add(r1);
        buildingList.add(b1);
        //buildingList.add(b2);

    }
}
