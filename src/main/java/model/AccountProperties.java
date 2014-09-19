package model;

/**
 * Created by Wojtek on 2014-09-19.
 */
public class AccountProperties {

    private String password;
    private String name;

    public AccountProperties(String nameC,String passC){
        name=nameC;
        password=passC;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
