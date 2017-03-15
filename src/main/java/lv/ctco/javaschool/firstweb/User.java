package lv.ctco.javaschool.firstweb;

/**
 * Created by olga.tubele on 3/14/2017.
 */
public class User {
    private String userName;
    private String userSurname;
    private Integer userDate;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public Integer getUserDate() {
        return userDate;
    }

    public void setUserDate(Integer userDate) {
        this.userDate = userDate;
    }

    public User(String userName, String userSurname, Integer userDate) {
        //this();
        this.userName = userName;
        this.userSurname = userSurname;
        this.userDate = userDate;
    }

    @Override
    public String toString() {
        return userName + " " + userSurname + ", " + userDate + "!";

    }
}
