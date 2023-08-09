package LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class AdminPortal {

    List<Book> bookList;
    List<User> userList;
    AdminPortal(){
        bookList=new ArrayList<>();
        userList=new ArrayList<>();
    }
    void addbook(Book b){bookList.add(b);}
    void removeBook(Book b){bookList.remove(b);}
    void addUser(User u){userList.add(u);}
    void removeUser(User u){userList.remove(u);}

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
