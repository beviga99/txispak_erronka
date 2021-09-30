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
        String name = myIntent.getStringExtra("name");
        String prize = myIntent.getStringExtra("prize");
        String qty = myIntent.getStringExtra("qty");
        String desk = myIntent.getStringExtra("desk");
        TextView text1 = (TextView) findViewById(R.id.textView);
        text1.setText(id + " Produktua: " + name);
        TextView text2 = (TextView) findViewById(R.id.textView3);
        text2.setText("Produktua" + prize);
        TextView text3 = (TextView) findViewById(R.id.textView4);
        text3.setText("Produktua" + qty);
        TextView text4 = (TextView) findViewById(R.id.textView5);
        text4.setText("Produktua" + desk);

    }
}
