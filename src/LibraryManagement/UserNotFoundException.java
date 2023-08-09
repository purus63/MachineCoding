package LibraryManagement;

public class UserNotFoundException extends RuntimeException{
    UserNotFoundException(String mesg){
        super(mesg);
    }
}
