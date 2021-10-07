package com.example.txipakfondo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String aukeratua = "All";
        readProductData(aukeratua);
    }

    @SuppressLint("ResourceType")
    private void readProductData(String aukeratua) {
        spin = findViewById(R.id.spinner);
        InputStream is = getResources().openRawResource(R.raw.produktuak);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );

        InputStream cat = getResources().openRawResource(R.raw.kategoria);
        BufferedReader readerCat = new BufferedReader(
                new InputStreamReader(cat, Charset.forName("UTF-8"))
        );

        ArrayList<String> kategoriak = new ArrayList<>();
        String line;

        try {
            readerCat.readLine();
            while (((line = readerCat.readLine()) != null)) {
                kategoriak.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayAdapter<String> nireadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, kategoriak);


        spin.setAdapter(nireadapter);
        line = "";

        try {
            boolean badago = true;
            reader.readLine();
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
                sample.setPrice(Double.parseDouble(tokens[2]));
                if (tokens[2].length() > 0) {
                    sample.setPrice(Double.parseDouble(tokens[2]));

                } else {
                    sample.setPrice(0);
                }
                sample.setQty(Double.parseDouble(tokens[3]));
                if (tokens[3].length() > 0) {
                    sample.setQty(Double.parseDouble(tokens[3]));

                } else {
                    sample.setQty(0);
                }
                sample.setDesk((tokens[4]));
                if (tokens[4].length() > 0) {
                    sample.setDesk(tokens[4]);

                } else {
                    sample.setDesk("");
                }
                sample.setCategory((tokens[5]));
                if (tokens[5].length() > 0) {
                    sample.setCategory(tokens[5]);
                    if (aukeratua.equals(tokens[5]) || aukeratua.equals("All")) {
                        Button bot = new Button(this);
                        ImageView irudi = new ImageView(this);

                        LinearLayout hlayour = new LinearLayout(this);
                        LinearLayout linearLayout = findViewById(R.id.linear_1);



                        hlayour.setOrientation(LinearLayout.HORIZONTAL);
                        bot.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent myIntent = new Intent(view.getContext(), BanakakoDatuak.class);
                                myIntent.putExtra("id", tokens[0]);
                                myIntent.putExtra("name", tokens[1]);
                                myIntent.putExtra("prize", tokens[2]);
                                myIntent.putExtra("qty", tokens[3]);
                                myIntent.putExtra("desk", tokens[4]);
                                myIntent.putExtra("category", tokens[5]);
                                startActivity(myIntent);
                            }
                        });
                        bot.setText(sample.getName());
                        bot.setWidth(1400);

                        bot.setGravity(Gravity.LEFT);

                        bot.setGravity(Gravity.CENTER | Gravity.LEFT);
                        String image = "@drawable/f"+tokens[0];
                        int imageResource = getResources().getIdentifier(image, null, getPackageName());

                        Drawable icon= getResources().getDrawable(imageResource);
                        Bitmap bitmap = ((BitmapDrawable) icon).getBitmap();
                        Drawable d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, 70, 70, true));

                        icon.setBounds(0, 0, 0, 0);
                        bot.setCompoundDrawablesWithIntrinsicBounds( null, null, d, null);

                        bot.setLayoutParams(new LinearLayout.LayoutParams(
                                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
                        ));
                        hlayour.addView(bot);
                        hlayour.addView(irudi);
                        badago = false;
                        linearLayout.addView(hlayour);
                        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                if (!(aukeratua.equals(String.valueOf(spin.getSelectedItem())))){
                                    linearLayout.removeAllViews();
                                    String aukeratua = String.valueOf(spin.getSelectedItem());
                                    readProductData(aukeratua);
                                    selectValue(spin, aukeratua);
                                }
                            }
                            private void selectValue(Spinner spinner, Object value) {
                                for (int i = 0; i < spinner.getCount(); i++) {
                                    if (spinner.getItemAtPosition(i).equals(value)) {
                                        spinner.setSelection(i);
                                        break;
                                    }
                                }
                            }
                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {
                                return;
                            }

                        });
                    }

                } else {
                    sample.setCategory("");
                }


            }
            if (badago) {
                LinearLayout linearLayout = findViewById(R.id.linear_1);
                TextView ezdago = new TextView(this);
                ezdago.setText("Ez dago kategoria horretako produkturik.");
                linearLayout.addView(ezdago);

            }
            badago = true;
        } catch (IOException e) {
            Log.wtf("My activity", "Falla en la linea: " + line, e);
            e.printStackTrace();
        }


    }

}