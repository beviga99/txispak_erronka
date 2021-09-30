package com.example.txipakfondo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BanakakoDatuak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banakakodatuak);

        readProductData();
    }

    private void readProductData() {
        Intent myIntent = getIntent();
        String id = myIntent.getStringExtra("id");
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Produktua" + id);

    }
}
