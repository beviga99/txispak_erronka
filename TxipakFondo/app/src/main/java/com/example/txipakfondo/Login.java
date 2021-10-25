package com.example.txipakfondo;

public class Login {
    String login;
    String password;

    public Login(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public Login(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
