package LibraryManagement;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Ticket {
    String id;
    User user;
    String  bookname;
    LocalDateTime bookedfrom;
    LocalDateTime bookedtill;

    public Ticket(String randomUUID, String bookname, LocalDateTime now, LocalDateTime till, User u) {
        this.id=randomUUID;
        this.bookname=bookname;
        this.bookedfrom=now;
        this.bookedtill=till;
        this.user=u;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getBookedfrom() {
        return bookedfrom;
    }

    public void setBookedfrom(LocalDateTime bookedfrom) {
        this.bookedfrom = bookedfrom;
    }

    public LocalDateTime getBookedtill() {
        return bookedtill;
    }

    public void setBookedtill(LocalDateTime bookedtill) {
        this.bookedtill = bookedtill;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", bookname='" + bookname + '\'' +
                ", bookedfrom=" + bookedfrom +
                ", bookedtill=" + bookedtill +
                '}';
    }
}
