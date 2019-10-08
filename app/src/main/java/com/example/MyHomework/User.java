package com.example.MyHomework;

public class User {
    private String userName;
    private String userID;
    private String userPW;
    private static int userNum;

    public User(String userName,String userID, String userPW){
        this.userName=userName;
        this.userID=userID;
        this.userPW=userPW;
        this.userNum+=1;//회원가입하면 회원수 증가
    }

    public User(){
        this.userNum+=1;
        this.userName=null;
        this.userID=null;
        this.userPW=null;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPW() {
        return userPW;
    }

    public void setUserPW(String userPW) {
        this.userPW = userPW;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }
}
