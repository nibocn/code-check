package me.nibo.codecheck;

public class Users {
    private int id;
    private String userName;

    public Users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void printInfo() throws Exception {
        System.out.println(id);
        System.out.println(userName);
    }

    public void close() {
        System.out.println("");
    }
}
