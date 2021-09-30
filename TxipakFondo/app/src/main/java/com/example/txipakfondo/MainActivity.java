package com.example.txipakfondo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

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

                    Log.d("Produktua", sample.toString());


            }
        } catch (IOException e) {
            Log.wtf("My activity", "Falla en la linea: " + line, e);
            e.printStackTrace();
        }


    }
}