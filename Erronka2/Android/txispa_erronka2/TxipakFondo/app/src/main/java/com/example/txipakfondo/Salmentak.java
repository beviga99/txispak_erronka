package com.example.txipakfondo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Salmentak extends AppCompatActivity {

    ArrayList<ProductSample> produktuak;
    ArrayList<String> bezeroak;
    TextView txt;
    Spinner spin_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salmentak);

        readProductData();
    }

    private void readProductData() {

        Konektatu con = new Konektatu();

        con.select();

        produktuak = con.selecta;

        bezeroak = con.bezeroak;

        Intent myIntent = getIntent();
        String id = myIntent.getStringExtra("id");
        String image = "@drawable/f"+id;
        int imageResource = getResources().getIdentifier(image, null, getPackageName());
        String name = myIntent.getStringExtra("name");
        String price = myIntent.getStringExtra("price");
        String qty = myIntent.getStringExtra("qty");
        ImageView image1 = findViewById(R.id.imageView);
        Drawable res = getResources().getDrawable(imageResource);
        image1.setImageDrawable(res);

        txt = findViewById(R.id.txt_product);
        txt.setText(id + ": "+ name + ", " + price+"€, qty: "+ qty);

        spin_b = findViewById(R.id.spin_bezero);
        ArrayAdapter<String> nireadapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, bezeroak);
        spin_b.setAdapter(nireadapter2);

        Button btnPrueba = findViewById(R.id.btn_eros);

        btnPrueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bezeroa = (String) spin_b.getSelectedItem();

                int bezeroaId = con.bezeroId(bezeroa);

                double price_d = Double.parseDouble(price);

                EditText kant = findViewById(R.id.txt_kant);
                String kant_s = kant.getText().toString();
                int kant_i = Integer.parseInt(kant_s);

                ProductSample p = new ProductSample(Integer.parseInt(id), name);

                Toast toast1 = Toast.makeText(getApplicationContext(), "Sartutako kantitatea biltegian dagoen kantitatea baino handiagoa da. Sartu kantitate txikiagoa.", Toast.LENGTH_SHORT);

                Toast toast2 = Toast.makeText(getApplicationContext(), "Ondo bidali da erosketa.", Toast.LENGTH_SHORT);

                if (Double.parseDouble(kant_s) > Double.parseDouble(qty)) {
                    toast1.show();
                } else {
                    toast2.show();
                    con.insert(p, bezeroaId,kant_i, price_d);
                    Intent myIntent2 = new Intent(view.getContext(), MainActivity.class);
                    startActivity(myIntent2);
                }

            }
        });


    }
}
