package LibraryManagement;

public class Book {
    int bookid;
    String bookname;
    String author;
    String pub;
    boolean isReserved;

    public Book(int bookid, String bookname, String author, String pub, boolean isReserved) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.author = author;
        this.pub = pub;
        this.isReserved = isReserved;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", pub='" + pub + '\'' +
                ", isReserved=" + isReserved +
                '}';
    }
}
