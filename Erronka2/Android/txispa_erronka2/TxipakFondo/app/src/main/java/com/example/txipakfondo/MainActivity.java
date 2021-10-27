package com.example.txipakfondo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<ProductSample> produktuak;
    ArrayList<String> kategoriak;
    Spinner spin;
    Toolbar tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Konektatu con = new Konektatu();
        produktuak = con.selecta;
        kategoriak = con.kategoriak;
        System.out.println("AAAAAAAAAAAAAA"+produktuak.size());
        System.out.println("AAAAAAAAAAAAAA22222"+kategoriak.size());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String aukeratua = "All";
        readProductData(aukeratua);
        tb=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);

    }


    @SuppressLint("ResourceType")
    private void readProductData(String aukeratua) {
        spin = findViewById(R.id.spinner);

        ArrayAdapter<String> nireadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, kategoriak);
        spin.setAdapter(nireadapter);

        boolean badago = true;

        for(ProductSample p : produktuak) {
            System.out.println(p.getId());
            ProductSample sample = new ProductSample();
            sample.setId(p.getId());

            sample.setName(p.getName());
            if (p.getName().length() > 0) {
                sample.setName(p.getName());

            } else {
                sample.setName("");
            }
            sample.setPrice(p.getPrice());
            if (String.valueOf(p.getPrice()).length() > 0) {
                sample.setPrice(p.getPrice());

            } else {
                sample.setPrice(0);
            }
            sample.setQty(p.getQty());
            if (String.valueOf(p.getQty()).length() > 0) {
                sample.setQty(p.getQty());

            } else {
                sample.setQty(0);
            }
            sample.setDesk(p.getDesk());
            if (p.getDesk().length() > 0) {
                sample.setDesk(p.getDesk());

            } else {
                sample.setDesk("");
            }
            sample.setCategory(p.getCategory());
            if (p.getCategory().length() > 0) {
                sample.setCategory(p.getCategory());
                if (aukeratua.equals(p.getCategory()) || aukeratua.equals("All")) {
                    Button bot = new Button(this);
                    ImageView irudi = new ImageView(this);

                    LinearLayout hlayour = new LinearLayout(this);
                    LinearLayout linearLayout = findViewById(R.id.linear_1);



                    hlayour.setOrientation(LinearLayout.HORIZONTAL);
                    bot.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent myIntent = new Intent(view.getContext(), BanakakoDatuak.class);
                            myIntent.putExtra("id", String.valueOf(p.getId()));
                            myIntent.putExtra("name", p.getName());
                            myIntent.putExtra("prize", String.valueOf(p.getPrice()));
                            myIntent.putExtra("qty", String.valueOf(p.getQty()));
                            myIntent.putExtra("desk", p.getDesk());
                            myIntent.putExtra("category", p.getCategory());
                            startActivity(myIntent);
                        }
                    });
                    bot.setText(sample.getName());
                    bot.setWidth(1400);

                    bot.setGravity(Gravity.LEFT);

                    bot.setGravity(Gravity.CENTER | Gravity.LEFT);
                    String image = "@drawable/f"+p.getId();
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

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.salmenta) {
            Toast.makeText(this, "OPCION 1", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

}