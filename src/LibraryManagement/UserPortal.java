package LibraryManagement;


import java.time.LocalDateTime;
import java.util.*;

public class UserPortal {

    Map<String, List<Ticket>> map;
    List<Ticket> ticketlist;

    public UserPortal(AdminPortal adm) {
        this.map = new HashMap<>();
        this.ticketlist = new ArrayList<>();
        this.adm = adm;
    }

    AdminPortal adm;
    boolean validateuser(User u){
        return adm.getUserList().contains(u);
    }
    boolean checkoutBook(User u,Book b) throws Exception{
        if(!validateuser(u)){
            throw new UserNotFoundException("User not Found");
        }
        if(!b.isReserved()){
            List<Ticket> list = map.get(u.getRegNo());
            if(list==null)
            {
                list=new ArrayList<>();
            }
            list.add(generateTicket(u,b));
            map.put(u.getRegNo(),list);
            return true;
        }
        else
            return false;
    }
    void returnBook(User u,Book b){
        b.setReserved(false);
        List<Ticket> list = map.get(u.getRegNo());
        if(list==null)
            return;
        Ticket t = list.stream().filter(x->x.getBookname().equals(b.getBookname())).toList().get(0);
        list.remove(t);
        ticketlist.remove(t);
        map.put(u.getRegNo(),list);
    }
    Ticket generateTicket(User u,Book b){
        b.setReserved(true);
        Ticket t = new Ticket(UUID.randomUUID().toString(),b.getBookname(), LocalDateTime.now(),LocalDateTime.now().plusDays(60),u);
        ticketlist.add(t);
        return t;
    }
    List<Book> searchBook(String name){
        List<Book> list = adm.getBookList().stream().filter(x -> (x.getBookname().equals(name) && !x.isReserved())).toList();
        return list;
    }
    Ticket trackBook(String name){
            List<Book> list = adm.getBookList().stream().filter(x -> x.getBookname().equals(name) && x.isReserved()).toList();
            if(list==null || list.size()==0)
                return null;
            Book b = list.get(0);
            return ticketlist.stream().filter(x->x.getBookname().equals(name)).toList().get(0);
    }
}
