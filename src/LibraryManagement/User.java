package LibraryManagement;

public class User {
    String regNo;
    String name;
    int mobno;

    public User(String regNo, String name, int mobno) {
        this.regNo = regNo;
        this.name = name;
        this.mobno = mobno;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobno() {
        return mobno;
    }

    public void setMobno(int mobno) {
        this.mobno = mobno;
    }

    @Override
    public String toString() {
        return "User{" +
                "regNo='" + regNo + '\'' +
                ", name='" + name + '\'' +
                ", mobno=" + mobno +
                '}';
    }
}
