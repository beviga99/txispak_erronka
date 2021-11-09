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

        String name = myIntent.getStringExtra("name");
        TextView txtName = findViewById(R.id.textView);
        txtName.setText(name);

        String prize = myIntent.getStringExtra("prize");
        TextView txtPrize = findViewById(R.id.prize);
        String sourceString = "<b> Prezioa: </b> " + prize;
        txtPrize.setText((Html.fromHtml(sourceString)));

        String qty = myIntent.getStringExtra("qty");
        TextView txtQty = findViewById(R.id.qty);
        sourceString = "<b> Kantitatea: </b> " + qty;
        txtQty.setText(Html.fromHtml(sourceString));

        String desk = myIntent.getStringExtra("desk");
        TextView txtDesk = findViewById(R.id.desk);
        sourceString = "<b> Deskribapena: </b> " + desk;
        txtDesk.setText(Html.fromHtml(sourceString));

        String category = myIntent.getStringExtra("category");
        TextView txtCategory = findViewById(R.id.category);
        sourceString = "<b> Kategoria: </b> " + category;
        txtCategory.setText(Html.fromHtml(sourceString));

        String id = myIntent.getStringExtra("id");
        String image = "@drawable/f"+id;
        int imageResource = getResources().getIdentifier(image, null, getPackageName());
        ImageView image1 = findViewById(R.id.imageView);
        Drawable res = getResources().getDrawable(imageResource);
        image1.setImageDrawable(res);

        Button erosi = findViewById(R.id.btn_erosi);
        if(Login.login){
            erosi.setVisibility(View.VISIBLE);
        }else{
            erosi.setVisibility(View.GONE);
        }

        Button atzera = findViewById(R.id.btn_atzera);
        atzera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent2 = new Intent(view.getContext(), MainActivity.class);
                startActivity(myIntent2);
            }
        });

        erosi.setOnClickListener(new View.OnClickListener() {
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

}
