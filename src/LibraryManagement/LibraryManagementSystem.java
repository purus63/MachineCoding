package LibraryManagement;

public class LibraryManagementSystem {

    public static void main(String[] args) throws Exception {

        Book book1= new Book(1,"Physics","SL Arora","Diksha",false);
        Book book2= new Book(1,"Chemistry","Pradeep","Dinesh",false);
        Book book3=new Book(1,"Maths","RD Sharma","Diksha",false);

        User user1=new User("001","Rahul",1234);
        User user2=new User("002","SKP",2345);
        User user3=new User("003","Tirtha",786);
        User user4=new User("004","Purushottam",786);

        AdminPortal ap = new AdminPortal();
        ap.addbook(book1);ap.addbook(book2);ap.addbook(book3);
        ap.addUser(user1);ap.addUser(user2);ap.addUser(user3);

        UserPortal up =new UserPortal(ap);

        System.out.println(up.searchBook("Physics").toString());
        System.out.println(up.checkoutBook(user3,book2));
        System.out.println(up.trackBook("Chemistry"));
        up.returnBook(user3,book2);
        System.out.println(up.trackBook("Chemistry"));
        System.out.println(up.trackBook("Economics"));



    }
}
