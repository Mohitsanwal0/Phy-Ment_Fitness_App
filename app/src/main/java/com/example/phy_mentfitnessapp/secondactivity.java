package com.example.phy_mentfitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class secondactivity extends AppCompatActivity {
int[] newArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);




        newArray= new  int[]{
                R.id.a, R.id.b, R.id.c, R.id.d, R.id.e, R.id.f, R.id.g, R.id.h, R.id.i, R.id.j, R.id.k, R.id.l, R.id.m, R.id.n, R.id.o

        };
    }

    public void ImageButtonclicked(View view) {

        for(int i=0;i< newArray.length;i++){
            if(view.getId()== newArray[i]){
                int value = i+1;
                Log.i( "FIRST", String.valueOf(value));
                Intent intent = new Intent(secondactivity.this,thirdactivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }


    }
}