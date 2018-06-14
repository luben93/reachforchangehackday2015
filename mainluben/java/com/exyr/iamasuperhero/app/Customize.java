package com.exyr.iamasuperhero.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Customize extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customize);

        Button super1 = (Button) findViewById(R.id.button1);
        android.widget.Button super2 = (Button) findViewById(R.id.button2);
        android.widget.Button super3 = (Button) findViewById(R.id.button3);
        android.widget.Button super4 = (Button) findViewById(R.id.button4);
        android.widget.Button super5 = (Button) findViewById(R.id.button5);
        android.widget.Button super6 = (Button) findViewById(R.id.button6);
        android.widget.Button super7 = (Button) findViewById(R.id.button7);

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
                        hats.setImageResource(R.drawable.mask1full);
                    }
                });
                hat2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ImageView hats = (ImageView) findViewById(R.id.hats);
                        hats.setImageResource(R.drawable.mask2full);
                    }
                });
                hat3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ImageView hats = (ImageView) findViewById(R.id.hats);
                        hats.setImageResource(R.drawable.mask3full);
                    }
                });
            }
        });

        super2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton hat1 = (ImageButton) findViewById(R.id.hat1);
                ImageButton hat2 = (ImageButton) findViewById(R.id.hat2);
                ImageButton hat3 = (ImageButton) findViewById(R.id.hat3);

                hat1.setImageResource(R.drawable.eyes1);
                hat2.setImageResource(R.drawable.eyes2);
                hat3.setImageResource(R.drawable.eyes3);

                hat1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ImageView hats = (ImageView) findViewById(R.id.hats);
                        hats.setImageResource(R.drawable.eyes1_full);
                    }
                });
                hat2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ImageView hats = (ImageView) findViewById(R.id.hats);
                        hats.setImageResource(R.drawable.eyes2full);
                    }
                });
                hat3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ImageView hats = (ImageView) findViewById(R.id.hats);
                        hats.setImageResource(R.drawable.eyes3full);
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
