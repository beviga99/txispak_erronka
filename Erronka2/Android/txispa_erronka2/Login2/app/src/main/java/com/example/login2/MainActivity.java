package com.example.login2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;
import android.widget.Toolbar;



public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText t1,t2;
    Konektatu c=new Konektatu();
    private Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.emaillogin);
        t2=findViewById(R.id.passwordlogin);
        b1=findViewById(R.id.loginbtn);
        b1.setOnClickListener(this::botoiaSakatu);
        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb.findViewById(R.id.toolbar));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    public void botoiaSakatu(View view) {
        c.login(t1.getText().toString(),t2.getText().toString());
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch(item.getItemId()){
            case R.id.Item1:
                Toast.makeText(this,"",Toast.LENGTH_SHORT).show();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}