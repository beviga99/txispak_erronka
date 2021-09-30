package com.example.txipakfondo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readProductData();
    }

    private List<ProductSample> productSample = new ArrayList<>();
    private void readProductData() {
        InputStream is = getResources().openRawResource(R.raw.produktuak);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line = "";
        try {
            reader.readLine();
            int bot_id = 0;
            Button button;
            while (((line = reader.readLine()) != null)){
                    String[] tokens = line.split(";");
                    ProductSample sample = new ProductSample();
                    sample.setId(Integer.parseInt(tokens[0]));

                    sample.setName((tokens[1]));
                    if (tokens[1].length() > 0) {
                        sample.setName(tokens[1]);

                    }else {
                        sample.setName("");
                    }
                    productSample.add(sample);

                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_1);

                LinearLayout hlayour = new LinearLayout(this);

                hlayour.setOrientation(LinearLayout.HORIZONTAL);

                Button bot = new Button(this);
                bot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(view.getContext(), BanakakoDatuak.class);
                        myIntent.putExtra("id", tokens[0]);
                        startActivityForResult(myIntent, 0);
                    }
                });
                bot.setId(bot_id);
                bot.setText(sample.getName());
                bot.setWidth(1400);
                bot.setGravity(Gravity.LEFT);

                bot.setLayoutParams(new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT
                ));
                hlayour.addView(bot);
                linearLayout.addView(hlayour);

                bot_id++;


//                    button = new Button(this);
//                    button.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            Intent myIntent = new Intent(view.getContext(), BanakakoDatuak.class);
//                            myIntent.putExtra("id", tokens[0]);
//                            startActivityForResult(myIntent, 0);
//                        }
//                    });
//                    button.setId(Integer.parseInt(tokens[0]));
//                    button.setText("Produktua: " + tokens[0]);
//
//                    LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
//                    button.setLayoutParams(new LinearLayout.LayoutParams(
//                            ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT
//                    ));
//                    layout.addView(button);
//
//                    Log.d("Produktua", sample.toString());
//

            }
        } catch (IOException e) {
            Log.wtf("My activity", "Falla en la linea: " + line, e);
            e.printStackTrace();
        }


    }
}