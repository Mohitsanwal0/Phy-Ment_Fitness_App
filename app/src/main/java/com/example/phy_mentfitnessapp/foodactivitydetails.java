package com.example.phy_mentfitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class foodactivitydetails extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodactivitydetails);
       textView = findViewById(R.id.text);
       String dstory = getIntent().getStringExtra("story");
       textView.setText(dstory);


    }

    public void gooback(View view) {
        Intent intent = new Intent(foodactivitydetails.this,foodactivity.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(foodactivitydetails.this,foodactivity.class);
        startActivity(intent);
        finish();
    }
}