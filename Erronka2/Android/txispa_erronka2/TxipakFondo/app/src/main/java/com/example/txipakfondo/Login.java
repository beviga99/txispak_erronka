package com.example.txipakfondo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

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

}
