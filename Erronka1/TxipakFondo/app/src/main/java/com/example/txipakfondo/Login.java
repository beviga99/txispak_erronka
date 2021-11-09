package com.example.txipakfondo;

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Login extends AppCompatActivity {
    Button b1;
    EditText t1,t2;
    Konektatu c=new Konektatu();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.emaillogin);
        t2=findViewById(R.id.passwordlogin);
        b1=findViewById(R.id.loginbtn);
        b1.setOnClickListener(this::botoiaSakatu);


    }

    public void botoiaSakatu(View view) {
        c.login(t1.getText().toString(),t2.getText().toString());
    }




=======
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
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
}
