package com.example.txipakfondo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button b1;
    EditText t1,t2;
    Konektatu c;
    static boolean login = false;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        c=new Konektatu();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        t1=findViewById(R.id.emaillogin);
        t2=findViewById(R.id.passwordlogin);
        b1=findViewById(R.id.loginbtn);
        b1.setOnClickListener(this::botoiaSakatu);
    }

    public void botoiaSakatu(View view) {
            if (c.login(t1.getText().toString(), t2.getText().toString())) {
                login = true;
                intent=new Intent(Login.this,MainActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(getApplicationContext(), "Ez zara salmenten arduraduna.", Toast.LENGTH_SHORT).show();
                intent=new Intent(Login.this,Login.class);
                startActivity(intent);

            }

    }

}
