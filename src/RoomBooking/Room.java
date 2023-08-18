package RoomBooking;

import java.util.UUID;

public class Room {
    String id;
    boolean isEmpty;

    public Room() {
        id= UUID.randomUUID().toString();
        isEmpty=true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", isEmpty=" + isEmpty +
                '}';
    }
}
