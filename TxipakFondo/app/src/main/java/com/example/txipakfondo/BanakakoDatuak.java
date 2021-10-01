package com.example.txipakfondo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
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
        String image = "@drawable/f"+id;
        int imageResource = getResources().getIdentifier(image, null, getPackageName());
        String name = myIntent.getStringExtra("name");
        String prize = myIntent.getStringExtra("prize");
        String qty = myIntent.getStringExtra("qty");
        String desk = myIntent.getStringExtra("desk");
        String category = myIntent.getStringExtra("category");
        ImageView image1 = findViewById(R.id.imageView);
        Drawable res = getResources().getDrawable(imageResource);
        image1.setImageDrawable(res);
        TextView text1 = findViewById(R.id.textView);
        text1.setText(name);
        TextView text2 = findViewById(R.id.textView3);
        text2.setText("Produktua" + prize);
        TextView text3 = findViewById(R.id.textView4);
        text3.setText("Produktua" + qty);
        TextView text4 = findViewById(R.id.textView5);
        text4.setText("Produktua" + desk);
        TextView text6 = findViewById(R.id.textView6);
        text4.setText("Produktua" + category);

    }
}
