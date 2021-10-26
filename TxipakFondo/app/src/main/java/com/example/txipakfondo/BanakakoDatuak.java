package com.example.txipakfondo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
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
        TextView text2 = findViewById(R.id.prize);
        String sourceString = "<b> Prezioa: </b> " + prize;
        text2.setText((Html.fromHtml(sourceString)));
        TextView text3 = findViewById(R.id.qty);
        sourceString = "<b> Kantitatea: </b> " + qty;
        text3.setText(Html.fromHtml(sourceString));
        TextView text4 = findViewById(R.id.desk);
        sourceString = "<b> Deskribapena: </b> " + desk;
        text4.setText(Html.fromHtml(sourceString));
        TextView text6 = findViewById(R.id.category);
        sourceString = "<b> Kategoria: </b> " + category;
        text6.setText(Html.fromHtml(sourceString));


        /*ProductSample p = new ProductSample(Integer.parseInt(id), name);

        Button btnPrueba = findViewById(R.id.btn_gorde);

        btnPrueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Konektatu connect = new Konektatu();
                connect.insert(p, 19, 5);
            }
        });*/

    }

}
