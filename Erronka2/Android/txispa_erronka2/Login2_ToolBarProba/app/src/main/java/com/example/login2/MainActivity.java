package com.example.login2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText t1,t2;
    Konektatu c=new Konektatu();
    Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.emaillogin);
        t2=findViewById(R.id.passwordlogin);
        b1=findViewById(R.id.loginbtn);
        b1.setOnClickListener(this::botoiaSakatu);
        tb=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.produktuak) {
            Toast.makeText(this, "OPCION 1", Toast.LENGTH_SHORT).show();
        }
        return true;
    }


    public void botoiaSakatu(View view) {
        c.login(t1.getText().toString(),t2.getText().toString());
    }


}