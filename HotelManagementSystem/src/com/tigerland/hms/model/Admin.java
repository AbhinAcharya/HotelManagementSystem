package com.tigerland.hms.model;

public class Admin {
    private int aId;
    private String userName;
    private String password;


    public Admin() {
    }

    public Admin(int aId, String userName, String password) {
        this.aId = aId;
        this.userName = userName;
        this.password = password;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aId=" + aId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
