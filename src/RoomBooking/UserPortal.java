package RoomBooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserPortal {

    List<User> userList;
    List<Ticket> ticketList;

    static HashMap<String,List<Ticket>> map=new HashMap<>();
    public UserPortal() {
        this.userList = new ArrayList<>();
        this.ticketList = new ArrayList<>();
    }

    List<Ticket> listticket(String roomid)
    {
        return ticketList.stream().filter(ticket -> ticket.getRoom().getId().equals(roomid)).toList();
    }

    public boolean roombook(String userid,String from,String to) {
        Room room = isRoomAvailable(from,to);
        if(room !=null)
        {
            Ticket t = generateTicket(userid,room,from,to);
            ticketList.add(t);
            return true;
        }
         return false;
    }

    private Ticket generateTicket(String userid, Room room, String from, String to) {
        Ticket t= new Ticket(userid,room,to,from);
        List<Ticket> ticketlist= map.get(userid);
        if(ticketlist==null)
        {
            ticketlist=new ArrayList<>();
        }
        ticketlist.add(t);
        map.put(userid,ticketlist);
        return t;
    }

    private Room isRoomAvailable(String from, String to) {
        List<Room> roomList = getRoomBasedonBuilding("a");

        for(Room room:roomList) {
            List<Ticket> ticketList1 = listticket(room.getId());
            if(isbookingpossible(ticketList1,room,from,to))
            {
                return room;
            }
        }
        return null;
    }

    private boolean isbookingpossible(List<Ticket> ticketList1,Room room,String from,String to) {
        return true;
    }

    List<Room> getRoomBasedonBuilding(String build_id)
    {
        Building building = BookingApp.findbuilding(build_id);
        List<Floor> floorList = building.getFloorList();
        List<Room> roomList=new ArrayList<>();
        for(Floor f:floorList)
        {
            roomList.addAll(f.getRoomList());
        }
        return  roomList;
    }

    boolean cancellBooking(Ticket t)
    {
        ticketList.remove(t);return true;
    }


    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
