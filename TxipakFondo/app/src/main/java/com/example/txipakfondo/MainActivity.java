package com.example.txipakfondo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.Button;

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
            while (((line = reader.readLine()) != null)) {
                String[] tokens = line.split(";");
                ProductSample sample = new ProductSample();
                sample.setId(Integer.parseInt(tokens[0]));

                sample.setName((tokens[1]));
                if (tokens[1].length() > 0) {
                    sample.setName(tokens[1]);

                } else {
                    sample.setName("");
                }
                productSample.add(sample);

                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_1);

                LinearLayout hlayour = new LinearLayout(this);

                hlayour.setOrientation(LinearLayout.HORIZONTAL);

                Button bot = new Button(this);
                bot.setId(bot_id);
                bot.setText(sample.getName());
                bot.setWidth(1400);
                bot.setGravity(Gravity.LEFT);
                hlayour.addView(bot);

                linearLayout.addView(hlayour);

                bot_id++;
            }
        } catch (IOException e) {
            Log.wtf("My activity", "Falla en la linea: " + line, e);
            e.printStackTrace();
        }


    }
}