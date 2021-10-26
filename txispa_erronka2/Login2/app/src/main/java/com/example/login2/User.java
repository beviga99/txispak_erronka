package com.example.login2;

public class User {
    int id;
    String email;
    String pass;

    public User(int id, String email, String pass) {
        this.id = id;
        this.email = email;
        this.pass = pass;
    }
    public User(){

    }
    public User(String email, String pass){
        this.email=email;
        this.pass=pass;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
