package com.example.ausrasu.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Customize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customize);

        android.widget.Button super1 = (android.widget.Button) findViewById(R.id.button1);
        android.widget.Button super2 = (android.widget.Button) findViewById(R.id.button2);
        android.widget.Button super3 = (android.widget.Button) findViewById(R.id.button3);
        android.widget.Button super4 = (android.widget.Button) findViewById(R.id.button4);
        android.widget.Button super5 = (android.widget.Button) findViewById(R.id.button5);
        android.widget.Button super6 = (android.widget.Button) findViewById(R.id.button6);
        android.widget.Button super7 = (android.widget.Button) findViewById(R.id.button7);

        super1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton hat1 = (ImageButton) findViewById(R.id.hat1);
                ImageButton hat2 = (ImageButton) findViewById(R.id.hat2);
                ImageButton hat3 = (ImageButton) findViewById(R.id.hat3);

                hat1.setImageResource(R.drawable.mask1);
                hat2.setImageResource(R.drawable.mask2);
                hat3.setImageResource(R.drawable.mask3);

                hat1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ImageView hats = (ImageView) findViewById(R.id.hats);
                        hats.setImageResource(R.drawable.mask1);
                    }
                });
                hat2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ImageView hats = (ImageView) findViewById(R.id.hats);
                        hats.setImageResource(R.drawable.mask2);
                    }
                });
                hat3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ImageView hats = (ImageView) findViewById(R.id.hats);
                        hats.setImageResource(R.drawable.mask3);
                    }
                });
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //    return true;
        //}

        return super.onOptionsItemSelected(item);
    }

}
