package com.example.txipakfondo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
<<<<<<< HEAD
=======
import android.view.View;
import android.widget.Button;
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BanakakoDatuak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banakakodatuak);

        readProductData();
<<<<<<< HEAD
=======

>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
    }

    private void readProductData() {
        Intent myIntent = getIntent();
        String id = myIntent.getStringExtra("id");
        String image = "@drawable/f"+id;
<<<<<<< HEAD
<<<<<<< HEAD
        System.out.println("id --> "+id);
=======
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
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

<<<<<<< HEAD
    }
=======
        Button btnPrueba = findViewById(R.id.btn_erosi);

        btnPrueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent2 = new Intent(view.getContext(), Salmentak.class);
                ProductSample p = new ProductSample(Integer.parseInt(id), name);
                myIntent2.putExtra("id", String.valueOf(p.getId()));
                myIntent2.putExtra("name", p.getName());
                myIntent2.putExtra("qty", qty);
                myIntent2.putExtra("price", prize);
                startActivity(myIntent2);
            }
        });


    }

>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
}
