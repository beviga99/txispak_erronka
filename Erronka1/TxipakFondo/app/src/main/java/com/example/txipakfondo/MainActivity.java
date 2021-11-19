package com.example.txipakfondo;

<<<<<<< HEAD
<<<<<<< HEAD
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
=======
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
<<<<<<< HEAD
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
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
=======
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
<<<<<<< HEAD
<<<<<<< HEAD

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
=======

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
=======

import java.util.ArrayList;
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4

public class MainActivity extends AppCompatActivity {
    ArrayList<ProductSample> produktuak;
    ArrayList<String> kategoriak;
    Spinner spin;
<<<<<<< HEAD
<<<<<<< HEAD
    Toolbar myToolbar;
=======
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Konektatu con = new Konektatu();
        produktuak = con.selecta;
        kategoriak = con.kategoriak;
        System.out.println("AAAAAAAAAAAAAA"+produktuak.size());
        System.out.println("AAAAAAAAAAAAAA22222"+kategoriak.size());
=======

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Konektatu con = new Konektatu();
        con.select();
        produktuak = con.selecta;
        kategoriak = con.kategoriak;
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String aukeratua = "All";
        readProductData(aukeratua);
<<<<<<< HEAD
<<<<<<< HEAD
        myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
=======
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4

    }


    @SuppressLint("ResourceType")
    private void readProductData(String aukeratua) {
        spin = findViewById(R.id.spinner);

        ArrayAdapter<String> nireadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, kategoriak);
        spin.setAdapter(nireadapter);

        boolean badago = true;
<<<<<<< HEAD
<<<<<<< HEAD

        for(ProductSample p : produktuak) {
            System.out.println("IDIDIDID : "+p.getId());
            ProductSample sample = new ProductSample();
            sample.setId(p.getId());

            sample.setName(p.getName());
            if (p.getName().length() > 0) {
                sample.setName(p.getName());

=======
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4

        for(ProductSample p : produktuak) {
            System.out.println(p.getId());
            ProductSample sample = new ProductSample();
            sample.setId(p.getId());

            sample.setName(p.getName());
            if (p.getName().length() > 0) {
                sample.setName(p.getName());

<<<<<<< HEAD
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
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


<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
        }
        if (badago) {
            LinearLayout linearLayout = findViewById(R.id.linear_1);
            TextView ezdago = new TextView(this);
            ezdago.setText("Ez dago kategoria horretako produkturik.");
            linearLayout.addView(ezdago);

        }
<<<<<<< HEAD
=======
        }
        if (badago) {
            LinearLayout linearLayout = findViewById(R.id.linear_1);
            TextView ezdago = new TextView(this);
            ezdago.setText("Ez dago kategoria horretako produkturik.");
            linearLayout.addView(ezdago);

        }
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
        badago = true;


    }
<<<<<<< HEAD
<<<<<<< HEAD
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
=======
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4

}