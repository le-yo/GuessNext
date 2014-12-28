package com.example.guessnext;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {
	Button button1;
	ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button);
        pic = (ImageView) findViewById(R.id.imageView1);
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pic = (ImageView) findViewById(R.id.imageView1);
				
				Random rn = new Random();
				int i = rn.nextInt(5)+1;
				Log.e("i", "String "+i);
				switch (i) {
				case 1:
					pic.setImageDrawable(getResources().getDrawable(R.drawable.barrack));
					break;
				case 2:
					pic.setImageDrawable(getResources().getDrawable(R.drawable.kaku));
					break;
				case 3:
					pic.setImageDrawable(getResources().getDrawable(R.drawable.fay));
					break;
				case 4:
					pic.setImageDrawable(getResources().getDrawable(R.drawable.kiptoo));
					break;
				case 5:
					pic.setImageDrawable(getResources().getDrawable(R.drawable.mum));
					break;

				default:
					pic.setImageDrawable(getResources().getDrawable(R.drawable.kiptoo));
					break;
				}
				

			}
		});


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
