package com.example.phy_mentfitnessapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Toolbar  toolbar = findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);


        button1 = findViewById(R.id.startyoga1);
        button2 = findViewById(R.id.startyoga2);

        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                           startActivity(intent);
                                       }
                                   }

        );
        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent intent = new Intent(MainActivity.this,secondactivity2.class);
                                           startActivity(intent);
                                       }
                                   }

        );


    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
      @Override
      public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id ==R.id.privacy){




            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dailyworkoutapps.com/privacy-policy.html"));
            startActivity(intent);
            return true;
        }
        if(id == R.id.id_term)
        { Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.termsfeed.com/blog/sample-mobile-app-terms-conditions-template/"));
            startActivity(intent);
            return true;

        }
         if(id == R.id.rate)
        {
            try{
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=" + getPackageName() )));
            }catch (Exception e){
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName() )));
            }
            return true;

        }
        if(id == R.id.more)
        { Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=9092911368589621824"));
            startActivity(intent);
            return true;

        }
        if(id == R.id.share)
        {
            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            String sharebody ="This is one of the best app for building overall health of the body \n As it targets Physical as well as Mental health of an individual \n Download now for free\n " + "https://play.google.com/store/apps/details?id=in.idealcoder.yogademoapp&hl=en";
            String sharehub = "Phy-Ment Fitness App";
            myIntent.putExtra(Intent.EXTRA_SUBJECT,sharehub);
            myIntent.putExtra(Intent.EXTRA_TEXT,sharehub);
            startActivity(Intent.createChooser(myIntent, "share using"));

            return true;
        }
        else
            return true;
    }



    public void beforeage18(View view) {
        Intent intent = new Intent(MainActivity.this,secondactivity.class);
        startActivity(intent);
    }

    public void afterage18(View view) {
        Intent intent = new Intent(MainActivity.this,secondactivity2.class);
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent = new Intent(MainActivity.this,foodactivity.class);
        startActivity(intent);
    }
}